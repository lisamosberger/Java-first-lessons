package com.example.java26.recordProgram;
public class PackageSystem {
    static void main() {
        ShippingInfo [] parcels = new ShippingInfo[10];
        int parcelCount = 0;
        while (parcelCount < 10) {
            //Registrera paket och deras dimensioner
            int width = Integer.parseInt(IO.readln("width: "));



            if (width == 1234) {
                IO.println("All Shippings");
                IO.println("------------------------");

                for (int i = 0; i < parcelCount; i++) {
                    int j;
                    j = i+1;
                    ShippingInfo parcel = parcels[i];

                    IO.println("Shipping Info: " + j);
                    IO.println("Size: " + parcel.box().depth() + "cm, " +
                            parcel.box().width() + "cm, " +
                            parcel.box().height() + "cm.");

                    IO.println("Price: " + parcel.ShippingPrice() + "kr");
                }
                break;
            }
            int height = Integer.parseInt(IO.readln("height: "));
            int depth = Integer.parseInt(IO.readln("depth: "));
            //Checka så paketen inte är större än 100x100x100 cm

            if (width > 100 || height > 100 || depth > 100 || depth <= 0 || width <= 0 || height <= 0) {
                IO.println("ERROR: box width or height must smaller than 100cm");
                continue;
            }
            Box box = new Box(width, height, depth);
            //Lagra kostnaden tillsammans med paketets information

            int price = calculateShippingPrice(box);
            ShippingInfo shippingInfo = new ShippingInfo(box, price);
            parcels[parcelCount] = shippingInfo;
            parcelCount++;

        }
    }


    private static int calculateShippingPrice(Box box) {
        //Beräkna pris för att skicka paketet när det registreras
        //1.Packet med alla sidor <= 20cm kostar 100kr
        //2.Paket > än 20cm kostar 200kr

        int price;
        if (box.width() <= 20 && box.height() <= 20 && box.depth() <= 20) {
            price = 100;
        } else {
            price = 200;
        }
        //3. Skrymmande paket har ett förhållande mellan sidorna på större än 1:2 kostar 50kr extra
        int maxSide = Math.max(box.width(), Math.max(box.height(), box.depth()));
        int smallestSide = Math.min(box.width(), Math.min(box.height(), box.depth()));
        if (maxSide > smallestSide * 2) {
            price += 50;
        }

        IO.println("Shipping price is " + price);
        return price;
    }

}