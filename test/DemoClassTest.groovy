class DemoClassTest extends BasePipelineTest {
    Script script

    @Override
    @Before
    void setUp() throws Exception {
        scriptRoots += 'vars'
        super.setUp()
        script = loadScript('demoVar.groovy')
    }

    @Test
    void demoTest() throws Exception {
        String result = script.call("abcd")

        assertEquals("dba", result)
    }
}