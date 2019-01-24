package {{cookiecutter.package}}.dto;

package {{cookiecutter.package}}.model。*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author evan
 * @date 2019-01-24
 */
@Mapper
public interface {{cookiecutter.module}}Mapper {

    {{cookiecutter.module}}Mapper  INSTANCE = Mappers.getMapper({{cookiecutter.module}}Mapper .class);


    /**
     *
     * @param {{cookiecutter.module|lower}}
     * @return
     */
    @Mappings({
            @Mapping(source = "name", target = "name"),    })
    {{cookiecutter.module}}Dto dto({{cookiecutter.module}} {{cookiecutter.module|lower}} );

    /**
     *
     * @param dto
     * @return
     */
    @Mappings({
            @Mapping(source = "name", target = "name")
    })
    {{cookiecutter.module}} model({{cookiecutter.module}}Dto dto);
}
