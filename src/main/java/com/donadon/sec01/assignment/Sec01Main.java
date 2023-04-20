package com.donadon.sec01.assignment;

import com.donadon.sec01.FileService;
import com.donadon.utils.Util;

import java.io.File;

public class Sec01Main {

    public static void main(String[] args) {
//        FileService.write("file03.txt", "Hello, my file with Reactive Mono")
//                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.read("file03.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.delete("file03.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }

}
