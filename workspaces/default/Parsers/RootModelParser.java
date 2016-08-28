import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		Social_linksModelParser social_links_parser;
		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
		CreatorModelParser creator_parser = new CreatorModelParser();
		VersionModelParser version_parser = new VersionModelParser();
		CopyrightModelParser copyright_parser = new CopyrightModelParser();

		public RootModelParser() {
			social_links_parser = new Social_linksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
					JSONArray social_links_arr = jsobj.getJSONArray("social_links");
			
					for(int i = 0 ;i<social_links_arr.length();i++){

 						social_linkss.add(social_links_parser.parseSocial_linksModel((String)social_links_arr.get(i)));

					}

					Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					local_model = new RootModel(social_linkss, jsobj.getString("description") , call_for_papers, jsobj.getString("organizer_description") , jsobj.getString("end_time") , jsobj.getString("location_name") , jsobj.getString("background_image") , jsobj.getString("code_of_conduct") , jsobj.getString("privacy") , jsobj.getString("timezone") , jsobj.getString("email") , jsobj.getString("topic") , creator, version, copyright, jsobj.getString("type") , jsobj.getString("organizer_name") , jsobj.getString("logo") , jsobj.getInt("id") , jsobj.getString("start_time") , jsobj.getString("name") , jsobj.getString("state") , jsobj.getString("schedule_published_on") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}