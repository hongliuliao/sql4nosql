sql4nosql
=========

sql nosql
 
This is a project about use sql to handle nosql things ,for example files ,java collections

Following is the Sql4PojoListConverter test:

        public List<MockUser> users = new ArrayList<MockUser>();
        private Sql4PojoListConverter converter;
        @Before
    	public void init() {
    		users.add(new MockUser(1,"tom",new Date()));
    		users.add(new MockUser(2,"jerry",new Date()));
    		users.add(new MockUser(3,"jim",new Date()));
    		converter = new Sql4PojoListConverter(users);
    	}
    	@Test
    	public void testQueryForList_selectOne() throws Exception {
    		List<Map<String, ?>> result = converter.queryForList("select name from users limit 0 2");
    		System.out.println("testQueryForList_selectOne:"+result);
    	} 
     
Then you will see the output in console:

    testQueryForList_selectOne:[{name=tom}, {name=jerry}]
