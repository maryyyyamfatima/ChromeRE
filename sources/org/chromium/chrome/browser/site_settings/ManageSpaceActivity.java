package org.chromium.chrome.browser.site_settings;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC4851eH1;
import defpackage.C5490g8;
import defpackage.C7034ke3;
import defpackage.C7629mN;
import defpackage.DialogC5834h8;
import defpackage.EI2;
import defpackage.IK1;
import defpackage.JK1;
import defpackage.KK1;
import defpackage.LK1;
import defpackage.O83;
import defpackage.Oo4;
import defpackage.Q83;
import org.chromium.chrome.browser.about_settings.AboutChromeSettings;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.components.browser_ui.site_settings.AllSiteSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ManageSpaceActivity extends a implements View.OnClickListener {
    public static boolean F;
    public Button A;
    public Button B;
    public Button C;
    public DialogC5834h8 D;
    public boolean E;
    public TextView y;
    public TextView z;

    public static void n0(ManageSpaceActivity manageSpaceActivity, long j, long j2) {
        manageSpaceActivity.getClass();
        EI2.e((int) (j / 1048576), "Android.ManageSpace.TotalDiskUsageMB");
        EI2.e((int) (j2 / 1048576), "Android.ManageSpace.UnimportantDiskUsageMB");
        manageSpaceActivity.z.setText(Formatter.formatFileSize(manageSpaceActivity, j));
        manageSpaceActivity.y.setText(Formatter.formatFileSize(manageSpaceActivity, j2));
    }

    @Override // defpackage.VS0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.E) {
            Profile d = Profile.d();
            new Oo4(d, false).c(C7034ke3.c(d, 22), new LK1(this));
        }
    }

    @Override // androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onStop() {
        super.onStop();
        O83.a.t("ManagedSpace.FailedBuildVersion", null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.A) {
            if (this.D == null) {
                C5490g8 c5490g8 = new C5490g8(this);
                c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f140717, new JK1(this));
                c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f1402f4, null);
                c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f140a8d);
                c5490g8.b(R.string.0_resource_name_obfuscated_res_0x7f140a91);
                this.D = c5490g8.a();
            }
            this.D.show();
            return;
        }
        if (view == this.B) {
            Bundle bundle = new Bundle();
            bundle.putString("category", C7034ke3.m(22));
            bundle.putString("title", getString(R.string.0_resource_name_obfuscated_res_0x7f140c47));
            EI2.h(1, 3, "Android.ManageSpace.ActionTaken");
            String name = AllSiteSettings.class.getName();
            Intent intent = new Intent();
            intent.setClass(this, SettingsActivity.class);
            intent.putExtra("show_fragment", name);
            intent.putExtra("show_fragment_args", bundle);
            ComponentName componentName = AbstractC2281Ro1.a;
            try {
                startActivity(intent, null);
                return;
            } catch (ActivityNotFoundException unused) {
                return;
            }
        }
        if (view == this.C) {
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            C5490g8 c5490g82 = new C5490g8(this);
            c5490g82.f(R.string.0_resource_name_obfuscated_res_0x7f140717, new KK1(this, activityManager));
            c5490g82.e(R.string.0_resource_name_obfuscated_res_0x7f1402f4, null);
            c5490g82.i(R.string.0_resource_name_obfuscated_res_0x7f140a96);
            c5490g82.b(R.string.0_resource_name_obfuscated_res_0x7f140a95);
            c5490g82.a().show();
        }
    }

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (!F) {
            F = true;
            try {
                if (getPackageManager().getActivityInfo(getComponentName(), 0).exported) {
                    throw new IllegalStateException("ManageSpaceActivity must not be exported.");
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        setTheme(R.style.f96090_resource_name_obfuscated_res_0x7f1501ae);
        setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e017c);
        Resources resources = getResources();
        setTitle(String.format(resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140a8e), resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1401f5)));
        TextView textView = (TextView) findViewById(R.id.site_data_storage_size_text);
        this.z = textView;
        textView.setText(R.string.0_resource_name_obfuscated_res_0x7f140a93);
        TextView textView2 = (TextView) findViewById(R.id.unimportant_site_data_storage_size_text);
        this.y = textView2;
        textView2.setText(R.string.0_resource_name_obfuscated_res_0x7f140a93);
        this.B = (Button) findViewById(R.id.manage_site_data_storage);
        this.A = (Button) findViewById(R.id.clear_unimportant_site_data_storage);
        this.B.setEnabled(false);
        this.A.setEnabled(false);
        this.B.setOnClickListener(this);
        this.A.setOnClickListener(this);
        Button button = (Button) findViewById(R.id.clear_all_data);
        this.C = button;
        button.setOnClickListener(this);
        super.onCreate(bundle);
        IK1 ik1 = new IK1(this);
        int i = AboutChromeSettings.l0;
        Q83 q83 = O83.a;
        if (TextUtils.equals(q83.i("ManagedSpace.FailedBuildVersion", null), "105.0.5195.136")) {
            ik1.Q(null);
            return;
        }
        q83.v("ManagedSpace.FailedBuildVersion", "105.0.5195.136");
        try {
            C7629mN.a().c(ik1);
            C7629mN.a().b(true, ik1);
        } catch (Exception e2) {
            AbstractC4851eH1.a("ManageSpaceActivity", "Unable to load native library.", e2);
            this.z.setText(R.string.0_resource_name_obfuscated_res_0x7f140a99);
            this.y.setText(R.string.0_resource_name_obfuscated_res_0x7f140a99);
        }
    }
}
