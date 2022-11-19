package uplord.uplordapi.sysManange.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import uplord.uplordapi.sysManange.dto.CellDTO;

import java.util.List;

@Mapper
@Repository
public interface CellDAO {
    List<CellDTO> findList(CellDTO param);

    int create(CellDTO param);

    int update(CellDTO param);
}
