import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public String logo;
	public String start_time;
	public String state;
	public String privacy;
	public String organizer_description;
	public String background_image;
	public String timezone;
	public String type;
	public String code_of_conduct;
	public String end_time;
	public String location_name;
	public CopyrightModel _copyright;
	public String description;
	public String organizer_name;
	public String email;
	public String topic;
	public VersionModel _version;
	public String schedule_published_on;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;

	public RootModel(Call_for_papersModel call_for_papers, String name, String logo, String start_time, String state, String privacy, String organizer_description, String background_image, String timezone, String type, String code_of_conduct, String end_time, String location_name, CopyrightModel copyright, String description, String organizer_name, String email, String topic, VersionModel version, String schedule_published_on, int id, ArrayList<Social_linksModel> social_links, CreatorModel creator) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this.logo = logo;
		this.start_time = start_time;
		this.state = state;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.timezone = timezone;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.location_name = location_name;
		this._copyright = copyright;
		this.description = description;
		this.organizer_name = organizer_name;
		this.email = email;
		this.topic = topic;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.social_links = social_links;
		this._creator = creator;

	}

}