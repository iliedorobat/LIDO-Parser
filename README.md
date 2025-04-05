# LIDO-Parser
Java parser for metadata presented according to LIDO XML Schema

## Requirements
JDK 11+ or OpenJDK 11+

## Setup
1. Download and install [JDK 11](https://www.oracle.com/nl/java/technologies/javase/jdk11-archive-downloads.html) or [OpenJDK 11](https://openjdk.org/install/) (or newer versions)
2. Clone the repository:
```bash
  git clone https://github.com/iliedorobat/LIDO-Parser.git
```
3. Generate the library:
```bash
  ./gradlew shadowJar
```

## Test the library:
```bash
  java -jar target/LIDO-Parser-1.2.jar
```

## Example
### Parsing:
```java
public class LidoWrapProcessing {
    private static final ParserDAO parserDAO = new ParserDAOImpl();

    public static void parse(String fullPath) {
        LidoWrap lidoWrap = parserDAO.parseLidoFile(fullPath);
        // Get the list of "lido" elements
        List<Lido> lidoList = lidoWrap.getLidoList();
        
        for (Lido lido : lidoList) {
            List<LidoRecID> lidoRecIDList = lido.getLidoRecID();
            Category category = lido.getCategory();
            List<AdministrativeMetadata> administrativeMetadataList = lido.getAdministrativeMetadata();
            List<DescriptiveMetadata> descriptiveMetadataList = lido.getDescriptiveMetadata();

            // then, you can go deeper to extract administrative/descriptive data, categories and lido ids
        }
    }
}
```

### Serialization using "jackson" library:
```java
public class LidoWrapProcessing {
    private static final ParserDAO parserDAO = new ParserDAOImpl();

    public static void serialize(String inputFullPath, outputPath) {
        LidoWrap lidoWrap = parserDAO.parseLidoFile(inputFullPath);
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File(outputPath), lidoWrap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
