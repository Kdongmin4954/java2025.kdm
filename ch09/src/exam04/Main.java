package exam04;

public class Main {

	public static void main(String[] args) {
//		public static void main(String[] args) {
//		Person worker = new Person() {
//			void Wake() {
//				System.out.println("Wake up at 6!!");
//			}
//			
//			void Work() {
//				System.out.println("Go to work!!");
//			}
//		};
//		//class Worker extends Person()
//		worker.Wake();
		
		NPCGenerator npc = new NPCGenerator();
		
//		npc.worker.Wake();
//		npc.GeneratorWalker();
		npc.GeneratorPerson(
				new Person() {
					void Wake() {
						System.out.println("Wake up at 6!!");
						Work();
					}
						
					void Work() {
						System.out.println("Go to walk!!");
						}
					}
			};
		}