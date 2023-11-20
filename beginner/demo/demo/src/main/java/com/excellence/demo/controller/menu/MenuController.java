package com.excellence.demo.controller.menu;

import com.excellence.demo.controller.menu.request.ExampleMenuRequest;
import com.excellence.demo.controller.menu.response.MenusResponse;
import com.excellence.demo.model.ExampleMenu;
import com.excellence.demo.service.MenuService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {
    private final MenuService service;

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public MenusResponse getAll() {
        //TODO: MenuServiceからメソッドを呼び出して、返り値を修正する
        List<ExampleMenu> menus = service.getAllMenu();
        MenusResponse response = new MenusResponse(menus);
        return response;
    }

    @PostMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ExampleMenuRequest request) {
        // TODO: create()を完成させる
    }

    public MenuController(MenuService service) {
        this.service = service;
    }
}