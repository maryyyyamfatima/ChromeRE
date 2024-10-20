package org.chromium.chrome.browser.management;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.C9097qe4;
import defpackage.QZ3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ManagementView extends ScrollView {
    public boolean a;
    public String g;
    public LinearLayout h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public QZ3 p;

    public ManagementView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = (LinearLayout) findViewById(R.id.management_container);
        this.i = (TextView) findViewById(R.id.title_text);
        this.j = (TextView) findViewById(R.id.description_text);
        this.k = (TextView) findViewById(R.id.learn_more);
        this.l = (TextView) findViewById(R.id.browser_reporting);
        this.m = (TextView) findViewById(R.id.browser_reporting_explanation);
        this.n = (TextView) findViewById(R.id.extension_report_username);
        this.o = (TextView) findViewById(R.id.extension_report_version);
        this.a = false;
        this.g = null;
        a();
        setFocusable(true);
        setFocusableInTouchMode(true);
        b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public final void a() {
        if (this.a) {
            if (TextUtils.isEmpty(this.g)) {
                this.i.setText(getResources().getString(R.string.f76810_resource_name_obfuscated_res_0x7f1405fb));
            } else {
                this.i.setText(getResources().getString(R.string.f76820_resource_name_obfuscated_res_0x7f1405fc, this.g));
            }
        } else {
            this.i.setText(getResources().getString(R.string.f76800_resource_name_obfuscated_res_0x7f1405fa));
        }
        this.j.setVisibility(this.a ? 0 : 4);
        this.k.setVisibility(this.a ? 0 : 4);
        this.l.setVisibility(this.a ? 0 : 4);
        this.m.setVisibility(this.a ? 0 : 4);
        this.n.setVisibility(this.a ? 0 : 4);
        this.o.setVisibility(this.a ? 0 : 4);
    }

    public final void b() {
        QZ3 qz3 = this.p;
        if (qz3 == null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f29450_resource_name_obfuscated_res_0x7f08010d);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f29460_resource_name_obfuscated_res_0x7f08010e);
            QZ3 qz32 = new QZ3(this.h);
            this.p = qz32;
            new C9097qe4(this.h, qz32, dimensionPixelSize, dimensionPixelSize2).b();
            return;
        }
        qz3.c();
    }
}
