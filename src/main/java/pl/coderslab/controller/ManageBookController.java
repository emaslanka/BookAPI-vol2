package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.enity.Book;
import pl.coderslab.service.BookService;
import pl.coderslab.service.JpaBookService;

import javax.validation.Valid;
import java.util.List;

@Controller

@RequestMapping("/admin/books")

public class ManageBookController {

    private final BookService bookService;

    public ManageBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public String showPosts(Model model) {

        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "/all";

    }

    @GetMapping("/{id}")
    @ResponseBody
    public String showOneBook(@PathVariable long id){
        Book b = bookService.findBook(id);
        return b.toString();
    }

    //add

    @GetMapping("/addbook")
    public String addForm(Model m){
        m.addAttribute("book", new Book());
        return "/add";
    }

    @PostMapping("/addbook")
    public String addFormPost(@ModelAttribute @Valid Book book, BindingResult violations){
        if(violations.hasErrors()){
            return "/add";
        }
        bookService.addBook(book);
        return "redirect:/admin/books/all";
    }



    //delete
    @DeleteMapping("/{id}")
    public void deleteOneBook(@PathVariable long id){
        bookService.deleteBook(id);

    }


    @GetMapping("/deletebook/{id}")
    public String deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
        return "redirect:all";


    }


    //update

    @GetMapping("/updatebook/{id}")
    public String updateBook(@PathVariable Long id, Model m){
        m.addAttribute("book", bookService.findBook(id));

        return "/update";
    }

    @PostMapping("/updatebook/")
    public String updateBookPost(Book book, BindingResult violations){
        if(violations.hasErrors()){
            return "/update";
        }
        bookService.addBook(book);
        return "redirect:/admin/books/all";
    }





}
