# Iota Seed Generator

The IotaSeedGenerator class provides a generateToken method, which takes a Integer as input to specifiy the length of the token, that will be generated.

```
IotaSeedGenerator generator = new IotaSeedGenerator();
generator.generateToken(50)
```

The IotaSeedFileGenerator class can be used from the commandline, once the code is compiled, to generate a txt file holding the generated token. It takes two arguments, the first is a Integer to specifiy the length of the token, the second is the filename for the file to be generated.

```
IotaSeedFileGenerator [keySize] [fileName]
```
