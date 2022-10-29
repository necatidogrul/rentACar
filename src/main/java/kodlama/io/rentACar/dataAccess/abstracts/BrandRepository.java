package kodlama.io.rentACar.dataAccess.abstracts;


import kodlama.io.rentACar.entities.concretes.Brand;

import java.util.List;

//Dao olarak da görülebilir repository.
public interface BrandRepository {
    List<Brand> getAll();
}
