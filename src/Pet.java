public class Pet {

        private String name;
        private String owner;
        private int age;
        private boolean isMale;


        public Pet(String name, int age, boolean isMale) {
            this.name = name;
            this.age = age;
            this.isMale = isMale;
            this.owner = null; // default empty
        }


        public Pet(int age, boolean isMale) {
            this.age = age;
            this.isMale = isMale;
            this.name = null;
            this.owner = null;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public boolean getIsMale() {
            return isMale;
        }

        public void beAdopted(String ownerName, String name) {
            this.owner = ownerName;
            this.name = name;
        }

        protected static boolean isNullOrEmpty(String s) {
            return s == null || s.isEmpty();
        }

        protected boolean hasOwner() {
            return !isNullOrEmpty(owner);
        }

        public void changeName(String name) {
            this.name = name;
        }
    }

