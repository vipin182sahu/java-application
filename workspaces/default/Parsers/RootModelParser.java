import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		CreatorModelParser creator_parser = new CreatorModelParser();
		CopyrightModelParser copyright_parser = new CopyrightModelParser();
		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
		Social_linksModelParser social_links_parser;
		VersionModelParser version_parser = new VersionModelParser();

		public RootModelParser() {
			social_links_parser = new Social_linksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

					ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
					JSONArray social_links_arr = jsobj.getJSONArray("social_links");
			
					for(int i = 0 ;i<social_links_arr.length();i++){

 						social_linkss.add(social_links_parser.parseSocial_linksModel((String)social_links_arr.get(i)));

					}

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					local_model = new RootModel(creator, jsobj.getString("topic") , copyright, jsobj.getString("email") , jsobj.getString("description") , call_for_papers, jsobj.getString("privacy") , jsobj.getString("code_of_conduct") , jsobj.getString("organizer_description") , jsobj.getString("logo") , jsobj.getString("state") , jsobj.getInt("id") , jsobj.getString("end_time") , jsobj.getString("schedule_published_on") , jsobj.getString("background_image") , social_linkss, jsobj.getString("start_time") , version, jsobj.getString("location_name") , jsobj.getString("type") , jsobj.getString("organizer_name") , jsobj.getString("timezone") , jsobj.getString("name") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}