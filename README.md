# LIDO-Parser
Java parser for metadata presented according to LIDO XML Schema

## Requirements
JDK 11+ or OpenJDK 11+<br/>
Maven 3.x

## Setup
1. Download and install [JDK 11](https://www.oracle.com/nl/java/technologies/javase/jdk11-archive-downloads.html) or [OpenJDK 11](https://openjdk.org/install/) (or newer versions)
2. Download and install [Maven 3.x](https://maven.apache.org/install.html)
3. Clone the repository:
```bash
git clone https://github.com/iliedorobat/LIDO-Parser.git
```
4. Generate the library:
```bash
mvn validate && mvn clean package
```

## Test the library:
```bash
java -jar target/LIDO-Parser-1.1-jar-with-dependencies.jar
```

## Example
### Parsing:
```java
public class LidoWrapProcessing {
    private static final ParserDAO parserDAO = new ParserDAOImpl();

    public static void parse(String fullPath) {
        LidoWrap lidoWrap = parserDAO.parseLidoFile(fullPath);
        // Get the list of "lido" elements
        ArrayList<Lido> lidoList = lidoWrap.getLidoList();
        
        for (Lido lido : lidoList) {
            ArrayList<LidoRecID> lidoRecIDList = lido.getLidoRecID();
            Category category = lido.getCategory();
            ArrayList<AdministrativeMetadata> administrativeMetadataList = lido.getAdministrativeMetadata();
            ArrayList<DescriptiveMetadata> descriptiveMetadataList = lido.getDescriptiveMetadata();

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
