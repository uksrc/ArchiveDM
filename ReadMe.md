Archive Data Model 
==================

The archive data model describes the observatory data products (ODP) and advanced
data products (ADP) that are available within the SRCNet. 
The model is defined using the
[IVOA VO-DML tools](https://ivoa.github.io/vo-dml/).

The source for the model is in [model/ArchiveDM-v1.vodsl](model/ArchiveDM-v1.vodsl)

```
gradle test
```
should build the model code and run tests against it.

The manually written parts of the documentation are in [doc/site](doc/site) and

```shell
gradle testSite
```

should build the site (including the parts autogenerated from the model) and make it available at http://localhost:8000

```shell
gradle doSite
```

will publish the documentation site to [https://uksrc.github.io/ArchiveDM/](https://uksrc.github.io/ArchiveDM/)