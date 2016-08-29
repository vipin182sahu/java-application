import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String privacy;
	public String logo;
	public int id;
	public String description;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String organizer_name;
	public String timezone;
	public String topic;
	public String background_image;
	public String start_time;
	public String schedule_published_on;
	public String email;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String location_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String type;
	public String state;

	public RootModel(Call_for_papersModel call_for_papers, String end_time, String privacy, String logo, int id, String description, String organizer_description, ArrayList<Social_linksModel> social_links, String name, String organizer_name, String timezone, String topic, String background_image, String start_time, String schedule_published_on, String email, CopyrightModel copyright, VersionModel version, String location_name, CreatorModel creator, String code_of_conduct, String type, String state) {

		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.privacy = privacy;
		this.logo = logo;
		this.id = id;
		this.description = description;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.name = name;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.topic = topic;
		this.background_image = background_image;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._copyright = copyright;
		this._version = version;
		this.location_name = location_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.state = state;

	}

}