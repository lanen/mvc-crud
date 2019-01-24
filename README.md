# 目的

简述重复的劳动

# 环境要求

* brew
* python

## 安装步骤

1. `brew install cookiecutter`
2. `cookiecutter https://github.com/lanen/mvc-crud.git`

```
src
└── com
    ├── controller
    │   └── BottleController.java
    ├── dao
    │   └── BottleRepository.java
    ├── dto
    │   ├── BottleDto.java
    │   └── BottleMapper.java
    ├── model
    │   └── Bottle.java
    └── service
        └── BottleService.java

6 directories, 6 files
```
