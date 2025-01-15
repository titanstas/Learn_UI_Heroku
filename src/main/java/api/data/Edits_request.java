package api.data;

public class Edits_request {

        public String key;
        public String text;
        public String session_id;

        public Edits_request(String key, String text, String session_id) {
                this.key = key;
                this.text = text;
                this.session_id = session_id;
        }

        public Edits_request() {

        }

        public String getKey() {
                return key;
        }

        public void setKey(String key) {
                this.key = key;
        }

        public String getText() {
                return text;
        }

        public void setText(String text) {
                this.text = text;
        }

        public String getSession_id() {
                return session_id;
        }

        public void setSession_id(String session_id) {
                this.session_id = session_id;
        }
}
