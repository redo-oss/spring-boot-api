package  com.gestionstock.demo.Controller;

import java.util.List;

import com.gestionstock.demo.Model.Article;
import com.gestionstock.demo.Model.Categorie;
import com.gestionstock.demo.Repository.ArticleRepository;
import com.gestionstock.demo.Repository.CategoriesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ArticleRepository articlerepository;
    @Autowired
    private CategoriesRepository categoriesRepository;

    @GetMapping("/articles")
    public List<Article> articles(){
        return articlerepository.findAll();
    }
    @PostMapping("/articles")
    public Article addArticle(@RequestBody Article article){
        return this.articlerepository.save(article);
    }
    @GetMapping("/categories")
    public List<Categorie> categories(){
        return this.categoriesRepository.findAll();
    }
    @PostMapping("/categories")
    public Categorie addCategorie(@RequestBody Categorie categorie){
        return this.categoriesRepository.save(categorie);
    }
    @GetMapping("/articles/iddes")
    public List<Article> getById(@RequestParam(name = "iddes") Integer iddes){
        return this.articlerepository.findByIddes(iddes);
    }

}
