package ma.sda.productservice.repository;

import ma.sda.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

public interface ProductRepository extends MongoRepository<Product, String> {
}
