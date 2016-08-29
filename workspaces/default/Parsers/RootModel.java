import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public String background_image;
	public String end_time;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String description;
	public String topic;
	public String name;
	public String state;
	public CreatorModel _creator;
	public String type;
	public String location_name;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String logo;
	public String organizer_description;
	public String start_time;
	public String code_of_conduct;
	public int id;
	public String privacy;
	public String schedule_published_on;

	public RootModel(Call_for_papersModel call_for_papers, String email, String background_image, String end_time, CopyrightModel copyright, String organizer_name, String description, String topic, String name, String state, CreatorModel creator, String type, String location_name, String timezone, ArrayList<Social_linksModel> social_links, VersionModel version, String logo, String organizer_description, String start_time, String code_of_conduct, int id, String privacy, String schedule_published_on) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this.background_image = background_image;
		this.end_time = end_time;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.description = description;
		this.topic = topic;
		this.name = name;
		this.state = state;
		this._creator = creator;
		this.type = type;
		this.location_name = location_name;
		this.timezone = timezone;
		this.social_links = social_links;
		this._version = version;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;

	}

}