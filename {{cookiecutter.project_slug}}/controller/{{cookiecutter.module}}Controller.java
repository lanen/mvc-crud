package {{cookiecutter.package}}.controller;

import {{cookiecutter.package}}.dto.*;
import {{cookiecutter.package}}.model.*;
import {{cookiecutter.package}}.service.{{cookiecutter.module}}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author evan
 * @date 2019-01-24
 */
@RestController
public class {{cookiecutter.module}}Controller {

    @Autowired
    private {{cookiecutter.module}}Service {{cookiecutter.module|lower}}Service;

    private static final {{cookiecutter.module}}Dto EMPTY = new {{cookiecutter.module}}Dto();

    @Override
    public ResponseEntity<{{cookiecutter.module}}Dto> delete{{cookiecutter.module}}(@PathVariable("{{cookiecutter.module|lower}}Id") Long {{cookiecutter.module|lower}}Id) {

        {{cookiecutter.module}} {{cookiecutter.module|lower}} = {{cookiecutter.module|lower}}Service.delete{{cookiecutter.module}}({{cookiecutter.module|lower}}Id);
        if (null == {{cookiecutter.module|lower}}){
            return ResponseEntity.ok(EMPTY);
        }
        return  ResponseEntity.ok({{cookiecutter.module}}Mapper.INSTANCE.dto({{cookiecutter.module|lower}}));

    }

    @Override
    public ResponseEntity<{{cookiecutter.module}}Dto> get{cookiecutter.module}}(@PathVariable("{{cookiecutter.module|lower}}Id") Long {{cookiecutter.module|lower}}Id) {
        {{cookiecutter.module}} {{cookiecutter.module|lower}} = {{cookiecutter.module|lower}}Service.read{{cookiecutter.module}}({{cookiecutter.module|lower}}Id);
        if (null == {{cookiecutter.module|lower}}){
            return ResponseEntity.ok(EMPTY);
        }
        return  ResponseEntity.ok({{cookiecutter.module}}Mapper.INSTANCE.dto({{cookiecutter.module|lower}}));
    }

    @Override
    public ResponseEntity<{{cookiecutter.module}}Dto> save{cookiecutter.module|lower}}(@PathVariable("{{cookiecutter.module|lower}}Id") Long {{cookiecutter.module|lower}}Id,
                                                @Valid @RequestBody {{cookiecutter.module}}Dto {{cookiecutter.module|lower}}Dto) {

        {{cookiecutter.module}} {{cookiecutter.module|lower}} = {{cookiecutter.module}}Mapper.INSTANCE.model({{cookiecutter.module|lower}}Dto);
        {{cookiecutter.module|lower}} = {{cookiecutter.module|lower}}Service.save{cookiecutter.module}}({cookiecutter.module|lower}});
        return ResponseEntity.ok({{cookiecutter.module|lower}}Mapper.INSTANCE.dto({{cookiecutter.module|lower}}));
    }
}

