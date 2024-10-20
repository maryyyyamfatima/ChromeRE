package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.share.send_tab_to_self.ManageAccountDevicesLinkView;
import org.chromium.chrome.browser.share.send_tab_to_self.TargetDeviceInfo;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tl0 */
/* loaded from: classes.dex */
public final class C2525Tl0 implements PB, AdapterView.OnItemClickListener {
    public final Context a;
    public final QB g;
    public ViewGroup h;
    public ViewGroup i;
    public final C2395Sl0 j;
    public final Profile k;
    public final String l;
    public final String m;

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final int b() {
        return 0;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final void destroy() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.0_resource_name_obfuscated_res_0x7f1409f8;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.0_resource_name_obfuscated_res_0x7f1409f6;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ C8385oa2 o() {
        return OB.a();
    }

    @Override // defpackage.PB
    public final /* synthetic */ void onBackPressed() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.0_resource_name_obfuscated_res_0x7f1409ec;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.0_resource_name_obfuscated_res_0x7f1409f7;
    }

    @Override // defpackage.PB
    public final float t() {
        return -1.0f;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return true;
    }

    public C2525Tl0(Context context, String str, String str2, QB qb, List list, Profile profile) {
        this.a = context;
        this.g = qb;
        this.k = profile;
        C2395Sl0 c2395Sl0 = new C2395Sl0(list);
        this.j = c2395Sl0;
        this.l = str;
        this.m = str2;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0269, (ViewGroup) null);
        this.h = viewGroup;
        ((TextView) viewGroup.findViewById(R.id.device_picker_toolbar)).setText(R.string.0_resource_name_obfuscated_res_0x7f1409f9);
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0268, (ViewGroup) null);
        this.i = viewGroup2;
        ListView listView = (ListView) viewGroup2.findViewById(R.id.device_picker_list);
        listView.setAdapter((ListAdapter) c2395Sl0);
        listView.setOnItemClickListener(this);
        listView.addFooterView(new ManageAccountDevicesLinkView(context, null));
    }

    @Override // defpackage.PB
    public final View c() {
        return this.i;
    }

    @Override // defpackage.PB
    public final View e() {
        return this.h;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        N.MDoBGNuj();
        TargetDeviceInfo targetDeviceInfo = (TargetDeviceInfo) this.j.a.get(i);
        N.M$fvB7ud(this.k, this.l, this.m, targetDeviceInfo.a);
        Context context = this.a;
        Resources resources = context.getResources();
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("SendTabToSelfV2") || N.M09VlOh_("UpcomingSharingFeatures")) {
            String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1409f1);
            int i2 = targetDeviceInfo.b;
            if (i2 == 6) {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1409f2);
            } else if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1409f0);
            }
            ZN3.c(context, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1409fb, string), 0).d();
        } else {
            ZN3.c(context, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1409fa, targetDeviceInfo.c), 0).d();
        }
        ((m) this.g).l(this, true, 0);
    }
}
