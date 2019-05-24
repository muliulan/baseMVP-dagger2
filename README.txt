添加模板代码
设置)Setting -> Editor ->  File and Code Templates -> Files 然后点击左上角绿色的+号

1.  activity
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

public class ${NAME}Activity extends MvpActivity<${NAME}Presenter> implements ${NAME}Contract.View {

	@Override
    public int getLayout() {
        return R.layout.activity_${layout_id};
    }

    @Override
    public void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    public void initView(Bundle savedInstanceState) {

    }

}






