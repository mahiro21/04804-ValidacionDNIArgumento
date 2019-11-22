/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public final class App {
    
    

    public final int DNI_NUM = 45911057;
    public final char DNI_CTR = 'K';

    public final void launchApp() {
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");
        System.out.print("DNI ......: ");
        System.out.print(DNI_NUM);
        System.out.println(DNI_CTR);
        System.out.println("---");
        int resultado = UtilesPrimitivos.calcular(DNI_NUM, DNI_CTR);
        System.out.println(UtilesPrimitivos.validar(resultado));
    }
}
