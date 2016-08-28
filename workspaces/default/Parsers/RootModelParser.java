import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		Social_linksModelParser social_links_parser;
		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
		VersionModelParser version_parser = new VersionModelParser();
		CreatorModelParser creator_parser = new CreatorModelParser();
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

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					local_model = new RootModel(jsobj.getString("privacy") , jsobj.getString("code_of_conduct") , jsobj.getString("type") , social_linkss, jsobj.getString("schedule_published_on") , call_for_papers, jsobj.getString("end_time") , jsobj.getInt("id") , jsobj.getString("logo") , jsobj.getString("email") , jsobj.getString("organizer_name") , jsobj.getString("name") , version, creator, jsobj.getString("topic") , jsobj.getString("description") , jsobj.getString("timezone") , jsobj.getString("start_time") , jsobj.getString("state") , jsobj.getString("location_name") , jsobj.getString("background_image") , jsobj.getString("organizer_description") , copyright, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}