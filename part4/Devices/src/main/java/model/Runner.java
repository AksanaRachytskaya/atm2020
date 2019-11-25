package model;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

public class Runner {

   public static void main(String[] args) throws MismatchedInputException {

      Menu menu = new Menu();
       menu.gadgetMenu();
   }

      }


    /* stuff = plugIn.getStuff(Stream.concat(Stream.of(fridge, washer, iron), reader1.read().stream()).collect(Collectors.toList()));
   *//*  stuff = plugIn.getStuff(Arrays.asList(fridge,washer,iron));*//*
       plugIn.getStuffPower(stuff);


       plugIn.getGadgetsByMaxPower(stuff, 260);

       plugIn.sortStuffByZoneAndByPower(stuff);*/

       /*Iwritable writer = new WriteToFile();
       writer.write((Stream.concat(Stream.of(fridge, washer, iron), reader.read().stream()).collect(Collectors.toList())));*/












