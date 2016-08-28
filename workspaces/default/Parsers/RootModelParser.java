import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
		Social_linksModelParser social_links_parser;
		CopyrightModelParser copyright_parser = new CopyrightModelParser();
		VersionModelParser version_parser = new VersionModelParser();
		CreatorModelParser creator_parser = new CreatorModelParser();

		public RootModelParser() {
			social_links_parser = new Social_linksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

					ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
					JSONArray social_links_arr = jsobj.getJSONArray("social_links");
			
					for(int i = 0 ;i<social_links_arr.length();i++){

 						social_linkss.add(social_links_parser.parseSocial_linksModel((String)social_links_arr.get(i)));

					}

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					local_model = new RootModel(jsobj.getString("organizer_description") , jsobj.getString("privacy") , jsobj.getString("organizer_name") , call_for_papers, social_linkss, copyright, jsobj.getString("description") , version, jsobj.getString("state") , jsobj.getString("start_time") , jsobj.getString("logo") , jsobj.getInt("id") , jsobj.getString("location_name") , jsobj.getString("topic") , jsobj.getString("timezone") , jsobj.getString("email") , jsobj.getString("code_of_conduct") , jsobj.getString("end_time") , jsobj.getString("type") , creator, jsobj.getString("schedule_published_on") , jsobj.getString("name") , jsobj.getString("background_image") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}