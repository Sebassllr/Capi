package com.api.capiro.repository;

import com.api.capiro.entities.Recomendacion;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List findRecomendationByClient(Long client) {
        String sql = "SELECT i.name " +
                "FROM ITEM_RECOMENDACION_LIST  ir " +
                "INNER JOIN ITEM i on i.id = ir.item_id " +
                "INNER JOIN RECOMENDACION r on ir.RECOMENDACION_LIST_ID = r.id " +
                "WHERE CLIENTE_ID = @id";
        sql = sql.replace("@id", client.toString());
        Query query = entityManager.createNativeQuery(sql);
        return query.getResultList();
    }
}
