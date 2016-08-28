import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public String code_of_conduct;
	public VersionModel _version;
	public String location_name;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String description;
	public String topic;
	public String state;
	public String background_image;
	public String name;
	public String end_time;
	public CreatorModel _creator;
	public String organizer_description;
	public String logo;
	public int id;
	public String start_time;
	public String privacy;
	public String timezone;
	public String type;
	public String schedule_published_on;

	public RootModel(Call_for_papersModel call_for_papers, String email, String code_of_conduct, VersionModel version, String location_name, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String organizer_name, String description, String topic, String state, String background_image, String name, String end_time, CreatorModel creator, String organizer_description, String logo, int id, String start_time, String privacy, String timezone, String type, String schedule_published_on) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.location_name = location_name;
		this._copyright = copyright;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.description = description;
		this.topic = topic;
		this.state = state;
		this.background_image = background_image;
		this.name = name;
		this.end_time = end_time;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.id = id;
		this.start_time = start_time;
		this.privacy = privacy;
		this.timezone = timezone;
		this.type = type;
		this.schedule_published_on = schedule_published_on;

	}

}