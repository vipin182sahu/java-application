import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String start_time;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String name;
	public String background_image;
	public String organizer_name;
	public String timezone;
	public String description;
	public String end_time;
	public CreatorModel _creator;
	public String type;
	public String logo;
	public int id;
	public VersionModel _version;
	public String email;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String state;
	public String privacy;
	public String schedule_published_on;

	public RootModel(Call_for_papersModel call_for_papers, String location_name, String start_time, String topic, ArrayList<Social_linksModel> social_links, String organizer_description, String name, String background_image, String organizer_name, String timezone, String description, String end_time, CreatorModel creator, String type, String logo, int id, VersionModel version, String email, String code_of_conduct, CopyrightModel copyright, String state, String privacy, String schedule_published_on) {

		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.start_time = start_time;
		this.topic = topic;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.name = name;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.description = description;
		this.end_time = end_time;
		this._creator = creator;
		this.type = type;
		this.logo = logo;
		this.id = id;
		this._version = version;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.state = state;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;

	}

}