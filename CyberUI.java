public class CyberUI {
    public static void main(String[] args) throws Exception {
Scanner leer = new Scanner(System.in);
        Random ran = new Random();
        int opcionPrincipal = 0;
        int opcionJuegos = 0;
        int opcionProcesos = 0;
        do {
            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║ 🔰  SISTEMA CENTRAL DE ENTRETENIMIENTO CIBERNÉTICO  🔰     ");
            System.out.println("╠════════════════════════════════════════════════════════════╣");

// Animación tipo "escaneo"
            System.out.println("║ Inicializando sistema de seguridad...                                                              ");
            System.out.println("║ Cargando módulos 🔐███░░░░░░░░░░░ 37%                                                     ");
            System.out.println("║ Estableciendo conexión segura... 🔌                                                                ");
            System.out.println("║ Validando integridad ✔                                                                            ");
            System.out.println("╠════════════════════════════════════════════════════════════╣");

            System.out.println("║              🛰️  MENÚ PRINCIPAL — CYBER UI  🛰️            ");
            System.out.println("╠════════════════════════════════════════════════════════════╣");

            System.out.println("║ 1. Miscelánea de Juegos  🎮  → Simulaciones y retos                                                ");
            System.out.println("║ 2. Procesos Matemáticos 🧮 → Herramientas analíticas                                                ");
            System.out.println("║ 3. Salir del Sistema 👋 → Cerrar conexión segura                                                   ");

            System.out.println("╚════════════════════════════════════════════════════════════╝");

            System.out.print("🔎 Ingrese una opción para continuar (modo seguro activo): ");
            opcionPrincipal = leer.nextInt();
            while (opcionPrincipal < 1 || opcionPrincipal > 3) {
                System.out.println("⚠️ Opción inválida. Solo se permite 1, 2 o 3.");
                System.out.print("Ingrese una opción válida: ");
                opcionPrincipal = leer.nextInt();
            }
            switch (opcionPrincipal) {
                case 1:
                    System.out.println("\n╔════════════════════════════════════════════════════════════╗");
                    System.out.println("║ 🛰️  MÓDULO DE ENTRENAMIENTO — MISCELÁNEA DE JUEGOS  🛰️   ║");
                    System.out.println("╠════════════════════════════════════════════════════════════╣");

// Animación estilo “inicialización de módulo”
                    System.out.println("║ Analizando entorno lúdico...                              ");
                    System.out.println("║ Cargando elementos interactivos... ████░░░░░ 54%           ");
                    System.out.println("║ Verificación de integridad de juegos ✔                    ");
                    System.out.println("║ Sistemas en línea. Preparado para ejecutar.               ");
                    System.out.println("╠════════════════════════════════════════════════════════════╣");

                    System.out.println("║                  🎮  LISTA DE SIMULADORES  🎮              ║");
                    System.out.println("╠════════════════════════════════════════════════════════════╣");

                    System.out.println("║ 1 Conteniendo virus 🦠  → Simulación de bioseguridad     ");
                    System.out.println("║ 2 Punto y Fama 🔐 → Prueba de lógica del hacker ético    ");
                    System.out.println("║ 3 La Margarita 🌼 → Sistema de decisiones aleatorias      ");

                    System.out.println("╚════════════════════════════════════════════════════════════╝");
                    System.out.print("🔎 Seleccione un módulo para ejecutar (1-3): ");
                    opcionJuegos = leer.nextInt();
                    // validar opcionJuegos (1..3)
                    while (opcionJuegos < 1 || opcionJuegos > 3) {
                        System.out.print("Opción inválida. 😔 Por favor, seleccione 1, 2 o 3: ");
                        opcionJuegos = leer.nextInt();
                    }
                    switch (opcionJuegos) {
                        case 1:
                            // BIENVENIDA
                            JOptionPane.showMessageDialog(null,
                                    "╔══════════════════════════════════════════════╗\n"
                                    + "║       JUEGO: CONTENIENDO VIRUS 🦠           ║\n"
                                    + "║ Protege el sistema informático de ataques  ║\n"
                                    + "║ Cada jugador es un analista de seguridad    ║\n"
                                    + "╚══════════════════════════════════════════════╝");

                            // VARIABLES INICIALES
                            int virusJugador1 = 10;
                            int virusJugador2 = 10;

                            int servidor1 = 0; // capacidad 1
                            int servidor2 = 0; // capacidad 2
                            int servidor3 = 0; // capacidad 3
                            int servidor4 = 0; // capacidad 4
                            int servidor5 = 0; // capacidad 5
                            int servidor6 = 0; // ilimitado

                            int capacidadServidor1 = 1;
                            int capacidadServidor2 = 2;
                            int capacidadServidor3 = 3;
                            int capacidadServidor4 = 4;
                            int capacidadServidor5 = 5;
                            int capacidadServidor6 = 1000;

                            boolean turnoJugador1 = true;
                            boolean juegoActivo = true;

                            // CICLO PRINCIPAL
                            while (juegoActivo == true) {

                                // MOSTRAR ESTADO
                                JOptionPane.showMessageDialog(null,
                                        "╔══════════════════════════════════════════════╗\n"
                                        + "║           ESTADO ACTUAL DEL SISTEMA          ║\n"
                                        + "╠══════════════════════════════════════════════╣\n"
                                        + "║ Jugador 1: " + virusJugador1 + " virus\n"
                                        + "║ Jugador 2: " + virusJugador2 + " virus\n"
                                        + "║ Servidor 1: " + servidor1 + "/" + capacidadServidor1 + "\n"
                                        + "║ Servidor 2: " + servidor2 + "/" + capacidadServidor2 + "\n"
                                        + "║ Servidor 3: " + servidor3 + "/" + capacidadServidor3 + "\n"
                                        + "║ Servidor 4: " + servidor4 + "/" + capacidadServidor4 + "\n"
                                        + "║ Servidor 5: " + servidor5 + "/" + capacidadServidor5 + "\n"
                                        + "║ Servidor 6: " + servidor6 + "/∞\n"
                                        + "╚══════════════════════════════════════════════╝");

                                int virusActual = 0;
                                if (turnoJugador1 == true) {
                                    virusActual = virusJugador1;
                                    JOptionPane.showMessageDialog(null, "╔════════════════════════╗\n"
                                            + "║     TURNO JUGADOR 1    ║\n"
                                            + "╚════════════════════════╝");
                                }
                                if (turnoJugador1 == false) {
                                    virusActual = virusJugador2;
                                    JOptionPane.showMessageDialog(null, "╔════════════════════════╗\n"
                                            + "║     TURNO JUGADOR 2    ║\n"
                                            + "╚════════════════════════╝");
                                }

                                // CICLO DE JUGADAS
                                while (virusActual > 0) {

                                    // PETICIÓN DE LANZAR DADO
                                    String entradaUsuario = JOptionPane.showInputDialog("Presiona 1 para lanzar el dado 🎲");
                                    boolean valido = false;
                                    int accion = 0;

                                    while (valido == false) {
                                        if (entradaUsuario != null && entradaUsuario.length() == 1) {
                                            char c = entradaUsuario.charAt(0);
                                            if (c >= '0' && c <= '9') {  // Validamos que sea un dígito
                                                accion = c - '0';        // Convertimos char a número
                                                if (accion == 1) {       // Solo aceptamos 1
                                                    valido = true;
                                                } else {
                                                    entradaUsuario = JOptionPane.showInputDialog("Debes presionar 1 para lanzar el dado 🎲");
                                                }
                                            } else {
                                                entradaUsuario = JOptionPane.showInputDialog("Debes ingresar un número válido");
                                            }
                                        } else {
                                            entradaUsuario = JOptionPane.showInputDialog("Debes ingresar un número válido");
                                        }
                                    }

                                    int numeroDado = ran.nextInt(6) + 1;
                                    JOptionPane.showMessageDialog(null, "Ha salido: " + numeroDado + " 🎲");

                                    boolean colapso = false;

                                    // SERVIDOR 1
                                    if (numeroDado == 1) {
                                        JOptionPane.showMessageDialog(null, "Intentando colocar virus en Servidor 1...");
                                        if (servidor1 < capacidadServidor1) {
                                            servidor1 = servidor1 + 1;
                                            virusActual = virusActual - 1;
                                            JOptionPane.showMessageDialog(null, "✅ Virus colocado en Servidor 1");
                                        }
                                        if (servidor1 >= capacidadServidor1) {
                                            JOptionPane.showMessageDialog(null, "⚠️ Servidor 1 colapsó por sobrecarga");
                                            virusActual = virusActual + servidor1;
                                            servidor1 = 0;
                                            colapso = true;
                                        }
                                    }

                                    // SERVIDOR 2
                                    if (numeroDado == 2) {
                                        JOptionPane.showMessageDialog(null, "Intentando colocar virus en Servidor 2...");
                                        if (servidor2 < capacidadServidor2) {
                                            servidor2 = servidor2 + 1;
                                            virusActual = virusActual - 1;
                                            JOptionPane.showMessageDialog(null, "✅ Virus colocado en Servidor 2");
                                        }
                                        if (servidor2 >= capacidadServidor2) {
                                            JOptionPane.showMessageDialog(null, "⚠️ Servidor 2 colapsó por sobrecarga");
                                            virusActual = virusActual + servidor2;
                                            servidor2 = 0;
                                            colapso = true;
                                        }
                                    }

                                    // SERVIDOR 3
                                    if (numeroDado == 3) {
                                        JOptionPane.showMessageDialog(null, "Intentando colocar virus en Servidor 3...");
                                        if (servidor3 < capacidadServidor3) {
                                            servidor3 = servidor3 + 1;
                                            virusActual = virusActual - 1;
                                            JOptionPane.showMessageDialog(null, "✅ Virus colocado en Servidor 3");
                                        }
                                        if (servidor3 >= capacidadServidor3) {
                                            JOptionPane.showMessageDialog(null, "⚠️ Servidor 3 colapsó por sobrecarga");
                                            virusActual = virusActual + servidor3;
                                            servidor3 = 0;
                                            colapso = true;
                                        }
                                    }

                                    // SERVIDOR 4
                                    if (numeroDado == 4) {
                                        JOptionPane.showMessageDialog(null, "Intentando colocar virus en Servidor 4...");
                                        if (servidor4 < capacidadServidor4) {
                                            servidor4 = servidor4 + 1;
                                            virusActual = virusActual - 1;
                                            JOptionPane.showMessageDialog(null, "✅ Virus colocado en Servidor 4");
                                        }
                                        if (servidor4 >= capacidadServidor4) {
                                            JOptionPane.showMessageDialog(null, "⚠️ Servidor 4 colapsó por sobrecarga");
                                            virusActual = virusActual + servidor4;
                                            servidor4 = 0;
                                            colapso = true;
                                        }
                                    }

                                    // SERVIDOR 5
                                    if (numeroDado == 5) {
                                        JOptionPane.showMessageDialog(null, "Intentando colocar virus en Servidor 5...");
                                        if (servidor5 < capacidadServidor5) {
                                            servidor5 = servidor5 + 1;
                                            virusActual = virusActual - 1;
                                            JOptionPane.showMessageDialog(null, "✅ Virus colocado en Servidor 5");
                                        }
                                        if (servidor5 >= capacidadServidor5) {
                                            JOptionPane.showMessageDialog(null, "⚠️ Servidor 5 colapsó por sobrecarga");
                                            virusActual = virusActual + servidor5;
                                            servidor5 = 0;
                                            colapso = true;
                                        }
                                    }

                                    // SERVIDOR 6
                                    if (numeroDado == 6) {
                                        JOptionPane.showMessageDialog(null, "Colocando virus en Servidor 6 (ilimitado)...");
                                        servidor6 = servidor6 + 1;
                                        virusActual = virusActual - 1;
                                        JOptionPane.showMessageDialog(null, "✅ Virus colocado en Servidor 6");
                                    }

                                    if (colapso == true) {
                                        JOptionPane.showMessageDialog(null, "💥 Has perdido tu turno debido al colapso del servidor.");
                                        break;
                                    }

                                    if (turnoJugador1 == true) {
                                        virusJugador1 = virusActual;
                                    }
                                    if (turnoJugador1 == false) {
                                        virusJugador2 = virusActual;
                                    }

                                    // MOSTRAR ESTADO DETALLADO
                                    JOptionPane.showMessageDialog(null,
                                            "╔══════════════════════════════════════════════╗\n"
                                            + "║ ESTADO DEL SISTEMA TRAS LA JUGADA           ║\n"
                                            + "╠══════════════════════════════════════════════╣\n"
                                            + "║ Servidor 1: " + servidor1 + "/" + capacidadServidor1 + "\n"
                                            + "║ Servidor 2: " + servidor2 + "/" + capacidadServidor2 + "\n"
                                            + "║ Servidor 3: " + servidor3 + "/" + capacidadServidor3 + "\n"
                                            + "║ Servidor 4: " + servidor4 + "/" + capacidadServidor4 + "\n"
                                            + "║ Servidor 5: " + servidor5 + "/" + capacidadServidor5 + "\n"
                                            + "║ Servidor 6: " + servidor6 + "/∞\n"
                                            + "║ Virus restantes del jugador actual: " + virusActual + "\n"
                                            + "╚══════════════════════════════════════════════╝");

                                    JOptionPane.showMessageDialog(null,
                                            "🔹 Analizando servidores...\n"
                                            + "🔹 Verificando capacidad y estabilidad...\n"
                                            + "🔹 Preparando siguiente lanzamiento de dado...\n");

                                }

                                // VERIFICAR GANADOR
                                if (virusJugador1 == 0 && virusJugador2 > 0) {
                                    JOptionPane.showMessageDialog(null, "🎉 ¡Jugador 1 ha aislado todos los virus y gana!");
                                    juegoActivo = false;
                                }
                                if (virusJugador2 == 0 && virusJugador1 > 0) {
                                    JOptionPane.showMessageDialog(null, "🎉 ¡Jugador 2 ha aislado todos los virus y gana!");
                                    juegoActivo = false;
                                }
                                if (virusJugador1 == 0 && virusJugador2 == 0) {
                                    JOptionPane.showMessageDialog(null, "🎉 Empate total! Ambos jugadores aislaron todos los virus.");
                                    juegoActivo = false;
                                }

                                if (turnoJugador1 == true) {
                                    turnoJugador1 = false;
                                } else {
                                    turnoJugador1 = true;
                                }

                                // ESPERAR ANTES DEL SIGUIENTE TURNO
                                int continuar = Integer.parseInt(JOptionPane.showInputDialog("Presiona 1 para continuar al siguiente turno..."));
                                while (continuar < 1 || continuar > 1) {
                                    continuar = Integer.parseInt(JOptionPane.showInputDialog("Debes presionar 1 para continuar..."));
                                }

                            }

                            JOptionPane.showMessageDialog(null,
                                    "╔══════════════════════════════════════════════╗\n"
                                    + "║      Gracias por jugar CONTENIENDO VIRUS    ║\n"
                                    + "║        Protege siempre tu sistema 🦠         ║\n"
                                    + "╚══════════════════════════════════════════════╝");
                            break;
                        case 2:
                            // ---------- CASE 2: PUNTO Y FAMA (SIN ARREGLOS) ----------
                            JOptionPane.showMessageDialog(null,
                                    "\n*** 1.2 Punto y fama para el hacking ético 🔐💻✨ ***\n",
                                    "MÓDULO 1.2 – PUNTO Y FAMA", JOptionPane.PLAIN_MESSAGE);

                            Random azar = new Random();

                            // ------------------------------------------------------------
                            // 1. GENERAR CÓDIGO DE 4 DÍGITOS DISTINTOS (sin arreglos)
                            // ------------------------------------------------------------
                            int c1,
                             c2,
                             c3,
                             c4;

                            c1 = azar.nextInt(10); // 0-9

                            // c2 distinto de c1
                            c2 = azar.nextInt(10);
                            while (c2 == c1) {
                                c2 = azar.nextInt(10);
                            }

                            // c3 distinto de c1 y c2
                            c3 = azar.nextInt(10);
                            while (c3 == c1 || c3 == c2) {
                                c3 = azar.nextInt(10);
                            }

                            // c4 distinto de c1, c2 y c3
                            c4 = azar.nextInt(10);
                            while (c4 == c1 || c4 == c2 || c4 == c3) {
                                c4 = azar.nextInt(10);
                            }

                            // ------------------------------------------------------------
                            // 2. INICIO DEL JUEGO
                            // ------------------------------------------------------------
                            JOptionPane.showMessageDialog(null,
                                    "────────────────────────────────────────────────────────────\n"
                                    + "                 ░█▀▄░█░█ ░█▀▀░█▀▄ ░█▀▀░█▀▀░█▀▄░█░░\n"
                                    + "                 ░█▀▄░█░█ ░█░░░█░█ ░█░░░█░░░█░█░█░░\n"
                                    + "                 ░█▄▄░▀▄▄ ░█▄▄░█▄▄ ░█▄▄░█▄▄░█▄▄░█▄▄\n"
                                    + "────────────────────────────────────────────────────────────\n"
                                    + " Modo: HACKER / MATRIX\n"
                                    + " Objetivo: Adivinar el código secreto de 4 dígitos\n",
                                    "INICIO DEL RETO CIBERNÉTICO", JOptionPane.PLAIN_MESSAGE);

                            boolean adivinado = false;
                            int intentos = 0;

                            JOptionPane.showMessageDialog(null,
                                    "╔════════════════════════════════════════════════════════╗\n"
                                    + "║  INICIANDO SECUENCIA: █ A C C E S S   C H A L L E N G E █  ║\n"
                                    + "╚════════════════════════════════════════════════════════╝\n"
                                    + "» Inyectando paquetes... [████████████░░░░░░] 75%\n"
                                    + "» Saltos en red estables\n"
                                    + "» Firmas del objetivo: 4 dígitos únicos\n\n"
                                    + "Consola segura lista para recibir intentos.",
                                    "CONSOLAS ACTIVADAS", JOptionPane.PLAIN_MESSAGE);

                            JOptionPane.showMessageDialog(null,
                                    "═══════════════════════════════════════════════════════\n"
                                    + " ¡Bienvenido al juego! Debes adivinar 4 dígitos distintos.\n"
                                    + "═══════════════════════════════════════════════════════\n\n"
                                    + "INSTRUCCIONES:\n"
                                    + " • Fama (⭐)  = dígito correcto y en posición correcta\n"
                                    + " • Punto (✴) = dígito correcto pero en otra posición\n"
                                    + "--------------------------------------------------",
                                    "PROTOCOLO DE DECODIFICACIÓN", JOptionPane.PLAIN_MESSAGE);

                            // ------------------------------------------------------------
                            // 3. BUCLE PRINCIPAL DEL JUEGO
                            // ------------------------------------------------------------
                            while (adivinado == false) {

                                int a1 = -1, a2 = -1, a3 = -1, a4 = -1;
                                boolean intentoValido = false;

                                // ---------------------------------------------
                                // Validar intento SIN ARREGLOS
                                // ---------------------------------------------
                                while (intentoValido == false) {

                                    String entrada = JOptionPane.showInputDialog(null,
                                            "Ingrese un número de 4 dígitos distintos:",
                                            "CAPTURA DE INTENTO", JOptionPane.QUESTION_MESSAGE);

                                    if (entrada == null) {
                                        JOptionPane.showMessageDialog(null, "No puedes cancelar en pleno ataque. ⚠️");
                                        continue;
                                    }

                                    // validar longitud
                                    if (entrada.length() == 4) {

                                        // validar que todos sean dígitos
                                        boolean todosDigitos = true;
                                        int k;
                                        for (k = 0; k < 4; k++) {
                                            char ch = entrada.charAt(k);
                                            if (ch < '0' || ch > '9') {
                                                todosDigitos = false;
                                            }
                                        }

                                        if (todosDigitos == true) {
                                            // convertir sin arreglos
                                            a1 = entrada.charAt(0) - '0';
                                            a2 = entrada.charAt(1) - '0';
                                            a3 = entrada.charAt(2) - '0';
                                            a4 = entrada.charAt(3) - '0';

                                            // validar repetidos
                                            boolean repetido = false;

                                            if (a1 == a2) {
                                                repetido = true;
                                            } else {
                                                if (a1 == a3) {
                                                    repetido = true;
                                                } else {
                                                    if (a1 == a4) {
                                                        repetido = true;
                                                    } else {
                                                        if (a2 == a3) {
                                                            repetido = true;
                                                        } else {
                                                            if (a2 == a4) {
                                                                repetido = true;
                                                            } else {
                                                                if (a3 == a4) {
                                                                    repetido = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                            if (repetido == false) {
                                                intentoValido = true;
                                            } else {
                                                JOptionPane.showMessageDialog(null,
                                                        "⚠️ Los dígitos no pueden repetirse.\nIntente de nuevo.",
                                                        "ERROR DE VALIDACIÓN", JOptionPane.ERROR_MESSAGE);
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null,
                                                    "⚠️ Solo se permiten dígitos del 0 al 9.",
                                                    "ENTRADA INVALIDA", JOptionPane.ERROR_MESSAGE);
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "⚠️ El código debe contener exactamente 4 dígitos.",
                                                "ERROR DE FORMATO", JOptionPane.WARNING_MESSAGE);
                                    }
                                }

                                // intento válido
                                intentos = intentos + 1;

                                // ------------------------------------------------------------
                                // 4. CALCULAR FAMAS Y PUNTOS
                                // ------------------------------------------------------------
                                int famas = 0;
                                int puntos = 0;

                                if (a1 == c1) {
                                    famas++;
                                }
                                if (a2 == c2) {
                                    famas++;
                                }
                                if (a3 == c3) {
                                    famas++;
                                }
                                if (a4 == c4) {
                                    famas++;
                                }

                                if (a1 == c2) {
                                    puntos++;
                                }
                                if (a1 == c3) {
                                    puntos++;
                                }
                                if (a1 == c4) {
                                    puntos++;
                                }

                                if (a2 == c1) {
                                    puntos++;
                                }
                                if (a2 == c3) {
                                    puntos++;
                                }
                                if (a2 == c4) {
                                    puntos++;
                                }

                                if (a3 == c1) {
                                    puntos++;
                                }
                                if (a3 == c2) {
                                    puntos++;
                                }
                                if (a3 == c4) {
                                    puntos++;
                                }

                                if (a4 == c1) {
                                    puntos++;
                                }
                                if (a4 == c2) {
                                    puntos++;
                                }
                                if (a4 == c3) {
                                    puntos++;
                                }

                                JOptionPane.showMessageDialog(null,
                                        "RESULTADO DEL INTENTO:\n"
                                        + "Famas ⭐: " + famas + "\n"
                                        + "Puntos ✴: " + puntos + "\n"
                                        + "---------------------------",
                                        "ANÁLISIS DEL MOTOR", JOptionPane.PLAIN_MESSAGE);

                                // ------------------------------------------------------------
                                // 5. ¿GANÓ?
                                // ------------------------------------------------------------
                                if (famas == 4) {
                                    adivinado = true;
                                } else {

                                    // Animación hacker
                                    JOptionPane.showMessageDialog(null,
                                            "⟪ ALERTA: INTENTO FALLIDO ⟫\n"
                                            + "Iniciando protocolo de contraintrusión...\n\n"
                                            + "01010100 01110010 01100001 01100011\n"
                                            + "01100101 00100000 01100010 01110010\n"
                                            + "01100101 01100011 01101000 01100001\n\n"
                                            + "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n"
                                            + "░░ CÓDIGOS CAYENDO… ░░\n"
                                            + "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n\n"
                                            + "» Firewall regenerando...\n"
                                            + "» Trampas activas...\n",
                                            "SISTEMA DEFENSIVO", JOptionPane.ERROR_MESSAGE);

                                    // Mostrar clave (solo para jurado)
                                    JOptionPane.showMessageDialog(null,
                                            "🔎 Código secreto generado (solo para pruebas):\n"
                                            + c1 + " " + c2 + " " + c3 + " " + c4,
                                            "DEBUG JURADO", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }

                            // ------------------------------------------------------------
                            // 6. RESULTADO FINAL Y NIVEL DE SEGURIDAD
                            // ------------------------------------------------------------
                            JOptionPane.showMessageDialog(null,
                                    "╔════════════════════════════════════════╗\n"
                                    + "║        █ V I C T O R I A  •  S Y S T E M █        ║\n"
                                    + "╚════════════════════════════════════════╝\n"
                                    + "» TRACE: Código descifrado.\n"
                                    + "» REWARD: Acceso concedido.",
                                    "ACCESO AUTORIZADO", JOptionPane.PLAIN_MESSAGE);

                            String nivel = "";

                            if (intentos >= 1) {
                                if (intentos <= 3) {
                                    nivel
                                            = "MUY INSEGURO ▓░░░░░  [RIESGO ALTO]\n"
                                            + "↳ Brecha inmediata.\n"
                                            + "» Recomendación: Refuerce cifrado.";
                                } else {
                                    if (intentos <= 6) {
                                        nivel
                                                = "DÉBIL ▓▓░░░░  [RIESGO MEDIO]\n"
                                                + "↳ El sistema resistió poco.\n"
                                                + "» Mejore complejidad.";
                                    } else {
                                        if (intentos <= 10) {
                                            nivel
                                                    = "MODERADO ▓▓▓░░░  [RIESGO CONTROLADO]\n"
                                                    + "↳ Defendió parcialmente.\n"
                                                    + "» Añadir autenticación.";
                                        } else {
                                            if (intentos <= 20) {
                                                nivel
                                                        = "SEGURO ▓▓▓▓░░  [SEGURIDAD ESTABLE]\n"
                                                        + "↳ Resistencia marcada.\n"
                                                        + "» Mantener actualizaciones.";
                                            } else {
                                                nivel
                                                        = "MUY SEGURO ▓▓▓▓▓░  [FORTALEZA ALTA]\n"
                                                        + "↳ Sistema robusto.\n"
                                                        + "» Apto para entornos críticos.";
                                            }
                                        }
                                    }
                                }
                            }

                            JOptionPane.showMessageDialog(null,
                                    "ANÁLISIS FINAL DE SEGURIDAD\n\n" + nivel
                                    + "\n\nSistemas restablecidos.",
                                    "REPORTE TÉCNICO", JOptionPane.PLAIN_MESSAGE);

                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "\n╔════════════════════════════════════════════════════════════╗\n"
                                    + "║ 🛰️ PROTOCOLO DE SIMULACIÓN — JUEGO: LA MARGARITA 🌼 ║\n"
                                    + "╠════════════════════════════════════════════════════════════╣\n"
                                    + "║ Ejecutando análisis estructural del tablero... 🔎 \n"
                                    + "║ Configuración detectada: 9 pétalos en anillo ✔ \n"
                                    + "║ Cada pétalo contiene 1 ficha inicial (estado estable) ✔ \n"
                                    + "╠════════════════════════════════════════════════════════════╣\n"
                                    + "║ 🔐 Reglas de interacción táctica: \n"
                                    + "║ • Cada turno permite retirar 1 o 2 fichas. \n"
                                    + "║ • Si se retiran 2, deben ser contiguas (modo circular). \n"
                                    + "║ • El agente que obtenga la última ficha asegura la victoria.\n"
                                    + "╚════════════════════════════════════════════════════════════╝");
                            int petalo1 = 1,
                             petalo2 = 1,
                             petalo3 = 1,
                             petalo4 = 1,
                             petalo5 = 1,
                             petalo6 = 1,
                             petalo7 = 1,
                             petalo8 = 1,
                             petalo9 = 1;
                            int totalFichas = 9;
                            int jugadorTurnoActual = 1; // 1 o 2
                            int contadorTurnosMargarita = 1;
                            while (totalFichas > 0) {
                                JOptionPane.showMessageDialog(null, "\n╔════════════════════════════════════════════════════════════╗\n"
                                        + "║ 🛰️ ESCANEO DEL ESTADO ACTUAL — MATRIZ DE PÉTALOS 🌼 ║\n"
                                        + "╠════════════════════════════════════════════════════════════╣\n"
                                        + "║ Estado de pétalos (1 = ficha presente, 0 = vacío):\n"
                                        + "║ 1:" + petalo1 + " 2:" + petalo2 + " 3:" + petalo3 + " 4:" + petalo4 + " 5:" + petalo5 + "\n"
                                        + "║ 6:" + petalo6 + " 7:" + petalo7 + " 8:" + petalo8 + " 9:" + petalo9 + "\n"
                                        + "╠════════════════════════════════════════════════════════════╣\n"
                                        + "║ 🔐 Turno del Operador " + jugadorTurnoActual + " (ID de turno: #" + contadorTurnosMargarita + ")\n"
                                        + "╚════════════════════════════════════════════════════════════╝");
                                String cantidadStr = JOptionPane.showInputDialog("🔎 Protocolo de acción: ¿Cuántas fichas desea retirar? (1 o 2): ");
                                int cantidadRetirar = Integer.parseInt(cantidadStr);
                                while (!(cantidadRetirar == 1 || cantidadRetirar == 2)) {
                                    cantidadStr = JOptionPane.showInputDialog("⚠ Entrada no autorizada. Reintente con 1 o 2: ");
                                    cantidadRetirar = Integer.parseInt(cantidadStr);
                                }
                                if (cantidadRetirar == 1) {
                                    String posicionStr = JOptionPane.showInputDialog("🔎 Seleccione coordenada del pétalo a intervenir (1-9): ");
                                    int posicionRetirar = Integer.parseInt(posicionStr);
                                    while (!(posicionRetirar >= 1 && posicionRetirar <= 9)) {
                                        posicionStr = JOptionPane.showInputDialog("⚠️ Posición inválida. Reingrese coordenada válida (1..9): ");
                                        posicionRetirar = Integer.parseInt(posicionStr);
                                    }
                                    int posicionValida = 0;
                                    if (posicionRetirar == 1) {
                                        if (petalo1 == 1) {
                                            posicionValida = 1;
                                        }
                                    } else {
                                        if (posicionRetirar == 2) {
                                            if (petalo2 == 1) {
                                                posicionValida = 1;
                                            }
                                        } else {
                                            if (posicionRetirar == 3) {
                                                if (petalo3 == 1) {
                                                    posicionValida = 1;
                                                }
                                            } else {
                                                if (posicionRetirar == 4) {
                                                    if (petalo4 == 1) {
                                                        posicionValida = 1;
                                                    }
                                                } else {
                                                    if (posicionRetirar == 5) {
                                                        if (petalo5 == 1) {
                                                            posicionValida = 1;
                                                        }
                                                    } else {
                                                        if (posicionRetirar == 6) {
                                                            if (petalo6 == 1) {
                                                                posicionValida = 1;
                                                            }
                                                        } else {
                                                            if (posicionRetirar == 7) {
                                                                if (petalo7 == 1) {
                                                                    posicionValida = 1;
                                                                }
                                                            } else {
                                                                if (posicionRetirar == 8) {
                                                                    if (petalo8 == 1) {
                                                                        posicionValida = 1;
                                                                    }
                                                                } else {
                                                                    if (posicionRetirar == 9) {
                                                                        if (petalo9 == 1) {
                                                                            posicionValida = 1;
                                                                        }
                                                                    } else {
// no
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (posicionValida == 0) {
                                        posicionStr = JOptionPane.showInputDialog("Esa posición está vacía. Ingrese otra posición válida (1-9): ");
                                        posicionRetirar = Integer.parseInt(posicionStr);
                                        posicionValida = 0;
                                        if (posicionRetirar == 1) {
                                            if (petalo1 == 1) {
                                                posicionValida = 1;
                                            }
                                        } else {
                                            if (posicionRetirar == 2) {
                                                if (petalo2 == 1) {
                                                    posicionValida = 1;
                                                }
                                            } else {
                                                if (posicionRetirar == 3) {
                                                    if (petalo3 == 1) {
                                                        posicionValida = 1;
                                                    }
                                                } else {
                                                    if (posicionRetirar == 4) {
                                                        if (petalo4 == 1) {
                                                            posicionValida = 1;
                                                        }
                                                    } else {
                                                        if (posicionRetirar == 5) {
                                                            if (petalo5 == 1) {
                                                                posicionValida = 1;
                                                            }
                                                        } else {
                                                            if (posicionRetirar == 6) {
                                                                if (petalo6 == 1) {
                                                                    posicionValida = 1;
                                                                }
                                                            } else {
                                                                if (posicionRetirar == 7) {
                                                                    if (petalo7 == 1) {
                                                                        posicionValida = 1;
                                                                    }
                                                                } else {
                                                                    if (posicionRetirar == 8) {
                                                                        if (petalo8 == 1) {
                                                                            posicionValida = 1;
                                                                        }
                                                                    } else {
                                                                        if (posicionRetirar == 9) {
                                                                            if (petalo9 == 1) {
                                                                                posicionValida = 1;
                                                                            }
                                                                        } else {
// no
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (posicionRetirar == 1) {
                                        petalo1 = 0;
                                    } else {
                                        if (posicionRetirar == 2) {
                                            petalo2 = 0;
                                        } else {
                                            if (posicionRetirar == 3) {
                                                petalo3 = 0;
                                            } else {
                                                if (posicionRetirar == 4) {
                                                    petalo4 = 0;
                                                } else {
                                                    if (posicionRetirar == 5) {
                                                        petalo5 = 0;
                                                    } else {
                                                        if (posicionRetirar == 6) {
                                                            petalo6 = 0;
                                                        } else {
                                                            if (posicionRetirar == 7) {
                                                                petalo7 = 0;
                                                            } else {
                                                                if (posicionRetirar == 8) {
                                                                    petalo8 = 0;
                                                                } else {
                                                                    if (posicionRetirar == 9) {
                                                                        petalo9 = 0;
                                                                    } else {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    totalFichas = totalFichas - 1;
                                } else { // retirar 2
                                    String posicion1Str = JOptionPane.showInputDialog("🔎 Seleccione la primera coordenada del par contiguo (1-9): ");
                                    int posicion1 = Integer.parseInt(posicion1Str);
                                    while (!(posicion1 >= 1 && posicion1 <= 9)) {
                                        posicion1Str = JOptionPane.showInputDialog("⚠️ Coordenada fuera de rango. Ingrese un valor válido (1..9): ");
                                        posicion1 = Integer.parseInt(posicion1Str);
                                    }
                                    String posicion2Str = JOptionPane.showInputDialog("🔎 Seleccione la segunda coordenada contigua (1-9): ");
                                    int posicion2 = Integer.parseInt(posicion2Str);
                                    while (!(posicion2 >= 1 && posicion2 <= 9)) {
                                        posicion2Str = JOptionPane.showInputDialog("⚠️ Coordenada fuera de rango. Ingrese un valor válido (1..9): ");
                                        posicion2 = Integer.parseInt(posicion2Str);
                                    }
                                    int esContigua = 0;
                                    int diferencia = posicion1 - posicion2;
                                    if (diferencia < 0) {
                                        diferencia = -diferencia;
                                    }
                                    if (diferencia == 1) {
                                        esContigua = 1;
                                    } else {
                                        if ((posicion1 == 1 && posicion2 == 9) || (posicion1 == 9 && posicion2 == 1)) {
                                            esContigua = 1;
                                        } else {
                                            esContigua = 0;
                                        }
                                    }
                                    while (esContigua == 0) {
                                        JOptionPane.showMessageDialog(null, "⚠️ Alerta: las coordenadas no son contiguas en el anillo. Ingrese una nueva pareja.\n");
                                        posicion1Str = JOptionPane.showInputDialog("🔎 Primera coordenada: ");
                                        posicion1 = Integer.parseInt(posicion1Str);
                                        while (!(posicion1 >= 1 && posicion1 <= 9)) {
                                            posicion1Str = JOptionPane.showInputDialog("⚠️ Coordenada fuera de rango. Valor válido (1..9): ");
                                            posicion1 = Integer.parseInt(posicion1Str);
                                        }
                                        posicion2Str = JOptionPane.showInputDialog("🔎 Segunda coordenada: ");
                                        posicion2 = Integer.parseInt(posicion2Str);
                                        while (!(posicion2 >= 1 && posicion2 <= 9)) {
                                            posicion2Str = JOptionPane.showInputDialog("⚠️ Coordenada fuera de rango. Valor válido (1..9): ");
                                            posicion2 = Integer.parseInt(posicion2Str);
                                        }
// Recalcular contigüidad en anillo
                                        diferencia = posicion1 - posicion2;
                                        if (diferencia < 0) {
                                            diferencia = -diferencia;
                                        }
                                        if (diferencia == 1) {
                                            esContigua = 1;
                                        } else {
                                            if ((posicion1 == 1 && posicion2 == 9) || (posicion1 == 9 && posicion2 == 1)) {
                                                esContigua = 1;
                                            } else {
                                                esContigua = 0;
                                            }
                                        }
                                    }
                                    int primeraTiene = 0;
                                    if (posicion1 == 1) {
                                        if (petalo1 == 1) {
                                            primeraTiene = 1;
                                        }
                                    } else {
                                        if (posicion1 == 2) {
                                            if (petalo2 == 1) {
                                                primeraTiene = 1;
                                            }
                                        } else {
                                            if (posicion1 == 3) {
                                                if (petalo3 == 1) {
                                                    primeraTiene = 1;
                                                }
                                            } else {
                                                if (posicion1 == 4) {
                                                    if (petalo4 == 1) {
                                                        primeraTiene = 1;
                                                    }
                                                } else {
                                                    if (posicion1 == 5) {
                                                        if (petalo5 == 1) {
                                                            primeraTiene = 1;
                                                        }
                                                    } else {
                                                        if (posicion1 == 6) {
                                                            if (petalo6 == 1) {
                                                                primeraTiene = 1;
                                                            }
                                                        } else {
                                                            if (posicion1 == 7) {
                                                                if (petalo7 == 1) {
                                                                    primeraTiene = 1;
                                                                }
                                                            } else {
                                                                if (posicion1 == 8) {
                                                                    if (petalo8 == 1) {
                                                                        primeraTiene = 1;
                                                                    }
                                                                } else {
                                                                    if (posicion1 == 9) {
                                                                        if (petalo9 == 1) {
                                                                            primeraTiene = 1;
                                                                        }
                                                                    } else {
// no
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    int segundaTiene = 0;
                                    if (posicion2 == 1) {
                                        if (petalo1 == 1) {
                                            segundaTiene = 1;
                                        }
                                    } else {
                                        if (posicion2 == 2) {
                                            if (petalo2 == 1) {
                                                segundaTiene = 1;
                                            }
                                        } else {
                                            if (posicion2 == 3) {
                                                if (petalo3 == 1) {
                                                    segundaTiene = 1;
                                                }
                                            } else {
                                                if (posicion2 == 4) {
                                                    if (petalo4 == 1) {
                                                        segundaTiene = 1;
                                                    }
                                                } else {
                                                    if (posicion2 == 5) {
                                                        if (petalo5 == 1) {
                                                            segundaTiene = 1;
                                                        }
                                                    } else {
                                                        if (posicion2 == 6) {
                                                            if (petalo6 == 1) {
                                                                segundaTiene = 1;
                                                            }
                                                        } else {
                                                            if (posicion2 == 7) {
                                                                if (petalo7 == 1) {
                                                                    segundaTiene = 1;
                                                                }
                                                            } else {
                                                                if (posicion2 == 8) {
                                                                    if (petalo8 == 1) {
                                                                        segundaTiene = 1;
                                                                    }
                                                                } else {
                                                                    if (posicion2 == 9) {
                                                                        if (petalo9 == 1) {
                                                                            segundaTiene = 1;
                                                                        }
                                                                    } else {
// no
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (!(primeraTiene == 1 && segundaTiene == 1)) {
                                        JOptionPane.showMessageDialog(null, "⚠️ Alerta: una o ambas coordenadas no contienen ficha disponible.\n"
                                                + "🔄 Reinicie la selección con un par contiguo que posea fichas activas.");
                                        posicion1Str = JOptionPane.showInputDialog("🔎 Primera coordenada: ");
                                        posicion1 = Integer.parseInt(posicion1Str);
                                        while (!(posicion1 >= 1 && posicion1 <= 9)) {
                                            posicion1Str = JOptionPane.showInputDialog("⚠️ Coordenada fuera de rango. Ingrese un valor válido (1..9): ");
                                            posicion1 = Integer.parseInt(posicion1Str);
                                        }
                                        posicion2Str = JOptionPane.showInputDialog("🔎 Segunda coordenada: ");
                                        posicion2 = Integer.parseInt(posicion2Str);
                                        while (!(posicion2 >= 1 && posicion2 <= 9)) {
                                            posicion2Str = JOptionPane.showInputDialog("⚠️ Coordenada fuera de rango. Ingrese un valor válido (1..9): ");
                                            posicion2 = Integer.parseInt(posicion2Str);
                                        }
// revalidar contigüidad
                                        esContigua = 0;
                                        diferencia = posicion1 - posicion2;
                                        if (diferencia < 0) {
                                            diferencia = -diferencia;
                                        }
                                        if (diferencia == 1) {
                                            esContigua = 1;
                                        } else {
                                            if ((posicion1 == 1 && posicion2 == 9) || (posicion1 == 9 && posicion2 == 1)) {
                                                esContigua = 1;
                                            } else {
                                                esContigua = 0;
                                            }
                                        }
                                        if (esContigua == 0) {
                                            continue;
                                        }
// revalidar presencia en ambas posiciones
                                        primeraTiene = 0;
                                        segundaTiene = 0;
                                        if (posicion1 == 1) {
                                            if (petalo1 == 1) {
                                                primeraTiene = 1;
                                            }
                                        } else {
                                            if (posicion1 == 2) {
                                                if (petalo2 == 1) {
                                                    primeraTiene = 1;
                                                }
                                            } else {
                                                if (posicion1 == 3) {
                                                    if (petalo3 == 1) {
                                                        primeraTiene = 1;
                                                    }
                                                } else {
                                                    if (posicion1 == 4) {
                                                        if (petalo4 == 1) {
                                                            primeraTiene = 1;
                                                        }
                                                    } else {
                                                        if (posicion1 == 5) {
                                                            if (petalo5 == 1) {
                                                                primeraTiene = 1;
                                                            }
                                                        } else {
                                                            if (posicion1 == 6) {
                                                                if (petalo6 == 1) {
                                                                    primeraTiene = 1;
                                                                }
                                                            } else {
                                                                if (posicion1 == 7) {
                                                                    if (petalo7 == 1) {
                                                                        primeraTiene = 1;
                                                                    }
                                                                } else {
                                                                    if (posicion1 == 8) {
                                                                        if (petalo8 == 1) {
                                                                            primeraTiene = 1;
                                                                        }
                                                                    } else {
                                                                        if (posicion1 == 9) {
                                                                            if (petalo9 == 1) {
                                                                                primeraTiene = 1;
                                                                            }
                                                                        } else {
// no
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (posicion2 == 1) {
                                            if (petalo1 == 1) {
                                                segundaTiene = 1;
                                            }
                                        } else {
                                            if (posicion2 == 2) {
                                                if (petalo2 == 1) {
                                                    segundaTiene = 1;
                                                }
                                            } else {
                                                if (posicion2 == 3) {
                                                    if (petalo3 == 1) {
                                                        segundaTiene = 1;
                                                    }
                                                } else {
                                                    if (posicion2 == 4) {
                                                        if (petalo4 == 1) {
                                                            segundaTiene = 1;
                                                        }
                                                    } else {
                                                        if (posicion2 == 5) {
                                                            if (petalo5 == 1) {
                                                                segundaTiene = 1;
                                                            }
                                                        } else {
                                                            if (posicion2 == 6) {
                                                                if (petalo6 == 1) {
                                                                    segundaTiene = 1;
                                                                }
                                                            } else {
                                                                if (posicion2 == 7) {
                                                                    if (petalo7 == 1) {
                                                                        segundaTiene = 1;
                                                                    }
                                                                } else {
                                                                    if (posicion2 == 8) {
                                                                        if (petalo8 == 1) {
                                                                            segundaTiene = 1;
                                                                        }
                                                                    } else {
                                                                        if (posicion2 == 9) {
                                                                            if (petalo9 == 1) {
                                                                                segundaTiene = 1;
                                                                            }
                                                                        } else {
// no
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } // fin revalidación pareja
// retirar ambas posiciones
                                    if (posicion1 == 1) {
                                        petalo1 = 0;
                                    } else {
                                        if (posicion1 == 2) {
                                            petalo2 = 0;
                                        } else {
                                            if (posicion1 == 3) {
                                                petalo3 = 0;
                                            } else {
                                                if (posicion1 == 4) {
                                                    petalo4 = 0;
                                                } else {
                                                    if (posicion1 == 5) {
                                                        petalo5 = 0;
                                                    } else {
                                                        if (posicion1 == 6) {
                                                            petalo6 = 0;
                                                        } else {
                                                            if (posicion1 == 7) {
                                                                petalo7 = 0;
                                                            } else {
                                                                if (posicion1 == 8) {
                                                                    petalo8 = 0;
                                                                } else {
                                                                    if (posicion1 == 9) {
                                                                        petalo9 = 0;
                                                                    } else {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (posicion2 == 1) {
                                        petalo1 = 0;
                                    } else {
                                        if (posicion2 == 2) {
                                            petalo2 = 0;
                                        } else {
                                            if (posicion2 == 3) {
                                                petalo3 = 0;
                                            } else {
                                                if (posicion2 == 4) {
                                                    petalo4 = 0;
                                                } else {
                                                    if (posicion2 == 5) {
                                                        petalo5 = 0;
                                                    } else {
                                                        if (posicion2 == 6) {
                                                            petalo6 = 0;
                                                        } else {
                                                            if (posicion2 == 7) {
                                                                petalo7 = 0;
                                                            } else {
                                                                if (posicion2 == 8) {
                                                                    petalo8 = 0;
                                                                } else {
                                                                    if (posicion2 == 9) {
                                                                        petalo9 = 0;
                                                                    } else {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    totalFichas = totalFichas - 2;
                                } // fin retirar 2
                                if (totalFichas <= 0) {
                                    JOptionPane.showMessageDialog(null, "El jugador " + jugadorTurnoActual + " se llevó la última ficha. ¡Gana!");
                                    break;
                                }
                                if (jugadorTurnoActual == 1) {
                                    jugadorTurnoActual = 2;
                                } else {
                                    jugadorTurnoActual = 1;
                                }
                                contadorTurnosMargarita = contadorTurnosMargarita + 1;
                            } // fin while margarita
                            break;

                        default:
                            System.out.println("Opción inválida.");
                    } // fin switch sub-juegos

                    break;
                case 2:
                    System.out.println("\n🧮═══════════════ PROCESOS MATEMÁTICOS — MÓDULO DE ANÁLISIS ═══════════════🧮");
                    System.out.println("🔍 Estos algoritmos forman parte del Sistema de Ciber–Análisis Numérico.");
                    System.out.println("   Cada operación simula rutinas usadas en auditorías matemáticas de seguridad.\n");

                    System.out.println("🛠 2.1 Multiplicación Rusa — Algoritmo de Descomposición Binaria ⚙️");
                    System.out.println("🔐 2.2 Cálculo de la CLAVE de un número — Clasificador de Integridad 🔑");
                    System.out.println("📡 2.3 Funciones trigonométricas (Series de Taylor) — Módulo de Aproximación 📐");
                    System.out.println("📐2.4 Conversión HEX → DEC — Sistema de Cálculo Base 16📐");

                    System.out.print("\n💾 Seleccione el módulo de análisis que desea ejecutar: ");
                    opcionProcesos = leer.nextInt();
                    // validar opcionProcesos
                    while (opcionProcesos < 1 || opcionProcesos > 4) {
                        System.out.print("Opción inválida. 😊 Seleccione 1, 2,3 o 4: ");
                        opcionProcesos = leer.nextInt();
                    }
                    switch (opcionProcesos) {
                        case 1:
                            // ============================================================
// 🔷 SISTEMA DE CÁLCULO — MÉTODO DE MULTIPLICACIÓN RUSA 🔷
// Versión Ultra-Visual / Interfaz Estética Avanzada (sin colores)
// ============================================================

                            System.out.println("\n");
                            System.out.println("═══════════════════════════════════════════════════════");
                            System.out.println("            🔵 MÉTODO DE MULTIPLICACIÓN RUSA 🔵");
                            System.out.println("═══════════════════════════════════════════════════════");
                            System.out.println(" Un método histórico basado en duplicar y dividir. ");
                            System.out.println(" Los números impares activan una suma selectiva. ");
                            System.out.println("───────────────────────────────────────────────────────\n");

// ------------------------------------------------------------
// 1. CAPTURA DE DATOS
// ------------------------------------------------------------
                            int multiplicador = 0;
                            int multiplicando = 0;

                            System.out.println("📥 Entrada de datos:");
                            System.out.println("──────────────────────");

                            System.out.print("• Ingrese el MULTIPLICADOR (entero positivo): ");
                            multiplicador = leer.nextInt();
                            while (multiplicador <= 0) {
                                System.out.print("  ⚠ Debe ser mayor que 0. Ingrese nuevamente: ");
                                multiplicador = leer.nextInt();
                            }

                            System.out.print("• Ingrese el MULTIPLICANDO (entero positivo): ");
                            multiplicando = leer.nextInt();
                            while (multiplicando <= 0) {
                                System.out.print("  ⚠ Debe ser mayor que 0. Ingrese nuevamente: ");
                                multiplicando = leer.nextInt();
                            }

// Guardar originales
                            int originalMultiplicador = multiplicador;
                            int originalMultiplicando = multiplicando;

// ------------------------------------------------------------
// 2. PRESENTACIÓN DEL PROCESO
// ------------------------------------------------------------
                            System.out.println("\n");
                            System.out.println("📊 PROCESAMIENTO — Tabla de Cálculo");
                            System.out.println("───────────────────────────────────────────────────────────");
                            System.out.println(" Columna izquierda se divide entre 2");
                            System.out.println(" Columna derecha se multiplica por 2");
                            System.out.println(" Los valores donde la izquierda es impar → se SUMAN");
                            System.out.println("───────────────────────────────────────────────────────────\n");

// Encabezado tabla
                            System.out.println("╔═══════════════════════╦══════════════════════════════╗");
                            System.out.printf("║   %-15s   ║   %-20s   ║\n",
                                    "MULTIPLICADOR", "MULTIPLICANDO");
                            System.out.println("╠═══════════════════════╬══════════════════════════════╣");

// ------------------------------------------------------------
// 3. ALGORITMO RUSO
// ------------------------------------------------------------
                            int sumaFinal = 0;

                            while (multiplicador >= 1) {

                                boolean esImpar = (multiplicador % 2 != 0);

                                if (esImpar) {
                                    System.out.printf(
                                            "║  %-15s   ║   %-20s   ║   ← Seleccionado (impar) ⭐\n",
                                            multiplicador, multiplicando
                                    );
                                    sumaFinal += multiplicando;
                                } else {
                                    System.out.printf("║  %-15s   ║   %-20s   ║\n",
                                            multiplicador, multiplicando);
                                }

                                multiplicador = multiplicador / 2;
                                multiplicando = multiplicando * 2;
                            }

                            System.out.println("████████████████████████████████████████████████████████████████████████████\n");

// ------------------------------------------------------------
// 4. RESULTADOS FINALES
// ------------------------------------------------------------
                            System.out.println("\n◤━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◥");
                            System.out.println("                 📘 RESULTADOS DEL PROCESO RUSO               ");
                            System.out.println("◣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◢");

                            System.out.println("\n📡 Suma total de los valores seleccionados (multiplicadores impares):");
                            System.out.println("   ➤ Resultado acumulado: " + sumaFinal);

                            System.out.println("\n🧮 Resultado final de la multiplicación:");
                            System.out.println("   ➤ " + originalMultiplicador + " × " + originalMultiplicando + " = " + sumaFinal);

                            System.out.println("\n◆━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◆");
                            System.out.println("   ✔ Operación completada exitosamente por el sistema.");
                            System.out.println("◆━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◆\n");

                            break;
                        case 2:
                            System.out.println("\n◤━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◥");
                            System.out.println("        🔐  MÓDULO 2.2 — GENERACIÓN DE CLAVE NUMÉRICA          ");
                            System.out.println("◣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◢");

                            System.out.println("\nEl sistema procederá a calcular la *clave digital* asociada al");
                            System.out.println("número ingresado, aplicando la siguiente regla criptográfica:");
                            System.out.println("   • Si el número es negativo → la clave asignada es: -1.");
                            System.out.println("   • Si el número es cero o positivo → se multiplican los dígitos");
                            System.out.println("     de derecha a izquierda por factores crecientes (2, 3, 4, ...).");
                            System.out.println("   • La suma total obtenida se reduce módulo 10 para obtener la clave.\n");

                            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

// ------------------------------------------------------------
// 1. LEER EL NÚMERO
// ------------------------------------------------------------
                            System.out.print("Ingrese un número entero: ");
                            int numero = leer.nextInt();

                            if (numero < 0) {
                                System.out.println("\n🔴 El número ingresado es negativo → clave = -1");
                                System.out.println("═══════════════════════════════════════════════════════════");
                                break;
                            }

// ------------------------------------------------------------
// 2. PROCESO PARA NÚMEROS POSITIVOS
// ------------------------------------------------------------
                            String numeroStr = Integer.toString(numero);
                            int longitud = numeroStr.length();

                            System.out.println("\nProceso de cálculo:");
                            System.out.println("Dígito (de derecha a izquierda) × Peso");
                            System.out.println("----------------------------------------------");

                            int peso = 2;              // Empieza en 2
                            int suma = 0;              // Suma acumulada

// Recorremos el número desde la derecha hacia la izquierda
                            for (int i = longitud - 1; i >= 0; i--) {
                                int digito = numeroStr.charAt(i) - '0';
                                int producto = digito * peso;

                                // Mostrar cada operación con formato vistoso
                                System.out.printf(" → %d × %d = %d%n", digito, peso, producto);

                                suma += producto;
                                peso++;  // Aumenta el peso para el siguiente dígito
                            }

// ------------------------------------------------------------
// 3. RESULTADOS FINALES
// ------------------------------------------------------------
                            System.out.println("----------------------------------------------");
                            System.out.println("Suma total de productos = " + suma);

                            int claveFinal = suma % 10;

                            System.out.println("Clave final (mod 10) = " + claveFinal + " ✔️");
                            System.out.println("==============================================");
                            break;
                        case 3:
                            System.out.println("\n** 2.3 Series de Taylor (PENDIENTE) **\n");

                            System.out.println("\n◤━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◥");
                            System.out.println("     📡 MÓDULO 2.3 — CÁLCULO TRIGONOMÉTRICO CON SERIES DE TAYLOR     ");
                            System.out.println("◣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◢");

                            System.out.println("\nEste módulo del sistema realiza un análisis matemático utilizando");
                            System.out.println("expansiones de Taylor para aproximar funciones trigonométricas.");
                            System.out.println("Procesos disponibles:");
                            System.out.println("  • Cálculo de sen(x) mediante serie infinita. ");
                            System.out.println("  • Cálculo de cos(x) mediante serie infinita.");
                            System.out.println("  • Derivación de funciones trigonométricas adicionales.");
                            System.out.println("\n⚙️  Sin funciones matemáticas avanzadas; todo calculado desde cero.\n");

                            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                            System.out.print("🔎 Ingrese el valor de x (en radianes): ");
                            double x = leer.nextDouble();

                            // Validación de términos
                            int terminos = 0;
                            while (terminos < 1) {
                                System.out.print("Ingrese cuántos términos quiere usar (mínimo 1): ");
                                terminos = leer.nextInt();

                                if (terminos < 1) {
                                    System.out.println("Debe ingresar un número válido de términos (>=1).");
                                }
                            }

                            // ================================
                            // CÁLCULO DE SEN(x)
                            // ================================
                            double seno = 0;

                            int nS = 0;
                            while (nS < terminos) {

                                int exponente = 2 * nS + 1;

                                double potencia = 1;
                                int iP = 1;
                                while (iP <= exponente) {
                                    potencia = potencia * x;
                                    iP = iP + 1;
                                }

                                int limite = 2 * nS + 1;
                                double factorial = 1;
                                int iF = 1;
                                while (iF <= limite) {
                                    factorial = factorial * iF;
                                    iF = iF + 1;
                                }

                                double signo;
                                if (nS % 2 == 0) {
                                    signo = 1;
                                } else {
                                    signo = -1;
                                }

                                double terminoActual = signo * (potencia / factorial);

                                seno = seno + terminoActual;

                                nS = nS + 1;
                            }

                            // ================================
                            // CÁLCULO DE COS(x)
                            // ================================
                            double coseno = 0;

                            int nC = 0;
                            while (nC < terminos) {

                                int exponente = 2 * nC;

                                double potencia = 1;
                                int iP = 1;
                                while (iP <= exponente) {
                                    potencia = potencia * x;
                                    iP = iP + 1;
                                }

                                int limite = 2 * nC;
                                double factorial = 1;
                                int iF = 1;
                                while (iF <= limite) {
                                    factorial = factorial * iF;
                                    iF = iF + 1;
                                }

                                double signo;
                                if (nC % 2 == 0) {
                                    signo = 1;
                                } else {
                                    signo = -1;
                                }

                                double terminoActual = signo * (potencia / factorial);

                                coseno = coseno + terminoActual;

                                nC = nC + 1;
                            }

                            // ===============================
                            // FUNCIONES TRIGONOMÉTRICAS DERIVADAS
                            // ===============================
                            // tan(x)
                            double tangente = 0;
                            boolean cosEsCeroTan = false;

                            if (coseno == 0) {
                                cosEsCeroTan = true;
                            }

                            if (cosEsCeroTan == false) {
                                tangente = seno / coseno;
                            }

                            // sec(x)
                            double secante = 0;
                            boolean cosEsCeroSec = false;

                            if (coseno == 0) {
                                cosEsCeroSec = true;
                            }

                            if (cosEsCeroSec == false) {
                                secante = 1.0 / coseno;
                            }

                            // csc(x) = 1/sen(x)
                            double cosecante = 0;
                            boolean senEsCeroCsc = false;

                            if (seno == 0) {
                                senEsCeroCsc = true;
                            }

                            if (senEsCeroCsc == false) {
                                cosecante = 1.0 / seno;
                            }

                            // cot(x) = cos/sen
                            double cotangente = 0;
                            boolean senEsCeroCot = false;

                            if (seno == 0) {
                                senEsCeroCot = true;
                            }

                            if (senEsCeroCot == false) {
                                cotangente = coseno / seno;
                            }

                            // ===============================
                            // MOSTRAR RESULTADOS
                            // ===============================
                            System.out.println("\n◤━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◥");
                            System.out.println("                 🔎 RESULTADOS DEL ANÁLISIS CON SERIES DE TAYLOR 🔍");
                            System.out.println("◣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◢");

                            System.out.println("\n📡 Funciones trigonométricas aproximadas para x = " + x + " rad\n");

                            System.out.println("➤ sen(" + x + ") ≈ " + seno + "  ⚡");
                            System.out.println("➤ cos(" + x + ") ≈ " + coseno + "  ⚡");
                            System.out.println("➤ tan(" + x + ") ≈ " + tangente + "  ⚡");
                            System.out.println("➤ sec(" + x + ") ≈ " + secante + "  ⚡");
                            System.out.println("➤ csc(" + x + ") ≈ " + cosecante + "  ⚡");
                            System.out.println("➤ cot(" + x + ") ≈ " + cotangente + "  ⚡");

                            System.out.println("\n🧩 Número de términos utilizados: " + terminos);

                            System.out.println("\n◆━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◆");
                            System.out.println("   🔐 Cálculo finalizado. Seguridad matemática garantizada por el sistema.   ");
                            System.out.println("◆━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◆");

                            break;

                        case 4:
                            System.out.println("\n╔══════════════════════════════════════════════════════════════╗");
                            System.out.println("║                  🔱  MÓDULO 2.4 — SISTEMA HEX  🔱            ║");
                            System.out.println("║             Conversión de Hexadecimal → Decimal              ║");
                            System.out.println("╚══════════════════════════════════════════════════════════════╝");

                            System.out.println("\nEl sistema procesará un número en base 16 y lo convertirá");
                            System.out.println("a su equivalente en base 10 utilizando operaciones manuales.");
                            System.out.println("✔ Sin arreglos, ✔ sin funciones externas, ✔ estilo ASCII.");

                            System.out.print("\nIngrese un número HEX (0-9, A-F): ");
                            String hex = leer.next();

                            // Validación manual
                            int valido = 1;
                            int iHex = 0;

                            while (iHex < hex.length()) {
                                char h = hex.charAt(iHex);

                                if (!((h >= '0' && h <= '9')
                                        || (h >= 'A' && h <= 'F')
                                        || (h >= 'a' && h <= 'f'))) {
                                    valido = 0;
                                }

                                iHex = iHex + 1;
                            }

                            while (valido == 0) {
                                System.out.print("❌ Entrada inválida. Solo (0-9, A-F). Intente de nuevo: ");
                                hex = leer.next();

                                valido = 1;
                                iHex = 0;

                                while (iHex < hex.length()) {
                                    char h = hex.charAt(iHex);
                                    if (!((h >= '0' && h <= '9')
                                            || (h >= 'A' && h <= 'F')
                                            || (h >= 'a' && h <= 'f'))) {
                                        valido = 0;
                                    }
                                    iHex = iHex + 1;
                                }
                            }

                            // Conversión HEX → DEC
                            System.out.println("\n╔════════════════════════════════════════════════════╗");
                            System.out.println("║             🔧  PROCESO DE CONVERSIÓN  🔧        ");
                            System.out.println("╚════════════════════════════════════════════════════╝");

                            int decimal = 0;
                            int potencia = 1;   // 16^0
                            int p = hex.length() - 1;

                            while (p >= 0) {
                                char h = hex.charAt(p);
                                int valor = 0;

                                if (h >= '0' && h <= '9') {
                                    valor = h - '0';
                                } else {
                                    if (h >= 'A' && h <= 'F') {
                                        valor = (h - 'A') + 10;
                                    } else {
                                        if (h >= 'a' && h <= 'f') {
                                            valor = (h - 'a') + 10;
                                        }
                                    }
                                }

                                System.out.println(" • Dígito: " + h + "  | Valor: " + valor + "  | x Potencia actual: " + potencia);

                                decimal = decimal + (valor * potencia);
                                potencia = potencia * 16;

                                p = p - 1;
                            }

                            System.out.println("\n╔═══════════════════════════════════════════╗");
                            System.out.println("║              🧮  RESULTADOS               ║");
                            System.out.println("╚═══════════════════════════════════════════╝");

                            System.out.println("HEX ingresado : " + hex.toUpperCase());
                            System.out.println("Valor DEC     : " + decimal);

                            System.out.println("\n✔ Conversión completada con éxito.");
                            System.out.println("✔ Sistema matemático operativo.\n");

                            break;
                        default:
                            System.out.println("\n⚠️ Comando no reconocido.");
                            System.out.println("▞▞▞ ERROR DE OPERACIÓN ▞▞▞");
                            System.out.println("La opción ingresada no coincide con ninguna acción disponible.");
                            System.out.println("Por favor, inténtelo nuevamente. 🔁");
                    }
                    break;

                case 3:
                    System.out.println("\n◤━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◥");
                    System.out.println("            🔒 DESCONEXIÓN DEL SISTEMA INICIADA 🔒");
                    System.out.println("◣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◢");
                    System.out.println("\nGracias por utilizar la plataforma. Tu sesión ha sido cerrada con éxito.");
                    System.out.println("Esperamos verte pronto nuevamente. 👋");
                    break;

                default:
                    System.out.println("\n⚠️ Entrada no válida.");
                    System.out.println("Verifique su selección y vuelva a intentarlo.");
            }

        } while (opcionPrincipal != 3);
    }
}
