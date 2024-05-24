package avltree;

import exceptions.ItemDuplicated;

public class TestAVL {
    public static void main(String[] args) {
        AVLTree<Integer> a1 = new AVLTree<Integer>();
        try {

            /*a1.insert(20);
            System.out.println(a1);
            a1.insert(30);
            System.out.println(a1);
            a1.insert(40);
            System.out.println(a1);
            System.out.println("Root: " + a1.getDataRoot());
            a1.insert(50);
            System.out.println(a1);
            a1.insert(60);
            System.out.println(a1);*/


            // Caso 1: Desequilibrio RSR
            a1.insert(50);
            System.out.println(a1);
            a1.insert(30);
            System.out.println(a1);
            a1.insert(70);
            System.out.println(a1);
            a1.insert(20);
            System.out.println(a1);
            a1.insert(40);
            System.out.println(a1);
            a1.insert(60);
            System.out.println(a1);
            a1.insert(80);
            System.out.println(a1);
            System.out.println("Root: " + a1.getDataRoot());

            // Caso 2: Desequilibrio RSL
            a1 = new AVLTree<Integer>();
            a1.insert(50);
            System.out.println(a1);
            a1.insert(70);
            System.out.println(a1);
            a1.insert(30);
            System.out.println(a1);
            a1.insert(80);
            System.out.println(a1);
            a1.insert(60);
            System.out.println(a1);
            a1.insert(40);
            System.out.println(a1);
            a1.insert(20);
            System.out.println(a1);
            System.out.println("Root: " + a1.getDataRoot());

            // Caso 3: Desequilibrio RDR
            a1 = new AVLTree<Integer>();
            a1.insert(50);
            System.out.println(a1);
            a1.insert(30);
            System.out.println(a1);
            a1.insert(70);
            System.out.println(a1);
            a1.insert(20);
            System.out.println(a1);
            a1.insert(40);
            System.out.println(a1);
            a1.insert(35);
            System.out.println(a1);
            System.out.println("Root: " + a1.getDataRoot());

            // Caso 4: Desequilibrio RDL
            a1 = new AVLTree<Integer>();
            a1.insert(50);
            System.out.println(a1);
            a1.insert(70);
            System.out.println(a1);
            a1.insert(30);
            System.out.println(a1);
            a1.insert(80);
            System.out.println(a1);
            a1.insert(60);
            System.out.println(a1);
            a1.insert(65);
            System.out.println(a1);
            System.out.println("Root: " + a1.getDataRoot());

            // Caso 5: Desequilibrio RSR y RDL
            a1 = new AVLTree<Integer>();
            a1.insert(50);
            System.out.println(a1);
            a1.insert(30);
            System.out.println(a1);
            a1.insert(70);
            System.out.println(a1);
            a1.insert(20);
            System.out.println(a1);
            a1.insert(40);
            System.out.println(a1);
            a1.insert(60);
            System.out.println(a1);
            a1.insert(55);
            System.out.println(a1);
            System.out.println("Root: " + a1.getDataRoot());

            // Caso 6: Desequilibrio RSL y RDR
            a1 = new AVLTree<Integer>();
            a1.insert(50);
            System.out.println(a1);
            a1.insert(70);
            System.out.println(a1);
            a1.insert(30);
            System.out.println(a1);
            a1.insert(80);
            System.out.println(a1);
            a1.insert(60);
            System.out.println(a1);
            a1.insert(45);
            System.out.println(a1);
            System.out.println("Root: " + a1.getDataRoot());

            // Caso 7: Desequilibrio RSR y RSL
            a1 = new AVLTree<Integer>();
            a1.insert(50);
            System.out.println(a1);
            a1.insert(30);
            System.out.println(a1);
            a1.insert(70);
            System.out.println(a1);
            a1.insert(60);
            System.out.println(a1);
            a1.insert(80);
            System.out.println(a1);
            a1.insert(55);
            System.out.println(a1);
            System.out.println("Root: " + a1.getDataRoot());

            // Caso 8: Desequilibrio RDR y RDL
            a1 = new AVLTree<Integer>();
            a1.insert(50);
            System.out.println(a1);
            a1.insert(70);
            System.out.println(a1);
            a1.insert(30);
            System.out.println(a1);
            a1.insert(60);
            System.out.println(a1);
            a1.insert(80);
            System.out.println(a1);
            a1.insert(65);
            System.out.println(a1);
            System.out.println("Root: " + a1.getDataRoot());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //CASO DE PRUEBA 1: INSERCIÓN EN ORDEN
        BSTree<Integer> bst = new BSTree<>();
        AVLTree<Integer> avl = new AVLTree<>();

        try {
            for (int i = 1; i <= 5; i++) {
                bst.insert(i);
                avl.insert(i);
            }

        System.out.println("BST height: " + bst.height(bst.getRoot()));
        System.out.println("AVL height: " + avl.height(avl.getRoot()));
        } catch (ItemDuplicated e) {
            System.out.println("Item duplicated in AVLTree: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error in BSTree: " + e.getMessage());
        }

        //CASO DE PRUEBA 2: BÚSQUEDA DE ELEMENTOS

        /*
        BSTree<Integer> bst = new BSTree<>();
        AVLTree<Integer> avl = new AVLTree<>();

        try {
            for (int i = 1; i <= 10; i++) {
                bst.insert(i);
                avl.insert(i);
            }

            System.out.println("BST search for 5: " + bst.search(5));
            System.out.println("AVL search for 5: " + avl.search(5));
        } catch (Exception e) {
            e.printStackTrace();
        }

         */
        BSTree<Integer> bst2 = new BSTree<>();
        AVLTree<Integer> avl2 = new AVLTree<>();
        
        try {
            for (int i = 1; i <= 10; i++) {
                bst2.insert(i);
                avl2.insert(i);
            }
        
            long startTime = System.nanoTime();
            bst2.search(5);
            long endTime = System.nanoTime();
            System.out.println("BST2 search time: " + (endTime - startTime) + " ns");
        
            startTime = System.nanoTime();
            avl2.search(5);
            endTime = System.nanoTime();
            System.out.println("AVL2 search time: " + (endTime - startTime) + " ns");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //CASO DE PRUEBA 3: ALTURA DE LOS ÁRBOLES AVL Y BSTREE

        BSTree<Integer> bst3 = new BSTree<>();
        AVLTree<Integer> avl3 = new AVLTree<>();

        try {
            for (int i = 1; i <= 50; i++) {
                bst3.insert(i);
                avl3.insert(i);
            }

            System.out.println("BST height: " + bst3.height(bst3.getRoot()));
            System.out.println("AVL height: " + avl3.height(avl3.getRoot()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //PRUEBA DE EJERCICIO02

        AVLTree<Integer> prueba2 = new AVLTree<>();

        // Insertar algunos elementos
        try {
            prueba2.insert(10);
            prueba2.insert(20);
            prueba2.insert(30);
            prueba2.insert(40);
            prueba2.insert(50);
            prueba2.insert(25);
        } 
        
        catch (ItemDuplicated e) {
            e.printStackTrace();
        }

        System.out.println("después de las inserciones: " + prueba2.toString());

        prueba2.delete(20);

        // Imprimir el árbol después de la eliminación
        System.out.println("después de eliminar el elemento 20: " + prueba2.toString());        

    }
}
