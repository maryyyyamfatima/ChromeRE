package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import org.chromium.chrome.browser.feed.followmanagement.FollowManagementItemView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6276iR0 {
    public final a a;
    public final View b;

    public C6276iR0(Activity activity) {
        this.a = (a) activity;
        C7616mK1 c7616mK1 = new C7616mK1();
        C4617dc3 c4617dc3 = new C4617dc3(c7616mK1);
        c4617dc3.Q(0, new C2591Ty1(R.layout.f57700_resource_name_obfuscated_res_0x7f0e0113), new TD2() { // from class: eR0
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                FollowManagementItemView followManagementItemView = (FollowManagementItemView) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = AbstractC6618jR0.a;
                if (pd2 == fd2) {
                    String str = (String) propertyModel.i(pd2);
                    followManagementItemView.a.setText(str);
                    followManagementItemView.j.setContentDescription(str);
                    return;
                }
                PD2 pd22 = AbstractC6618jR0.b;
                if (pd22 == fd2) {
                    followManagementItemView.g.setText((String) propertyModel.i(pd22));
                    return;
                }
                PD2 pd23 = AbstractC6618jR0.c;
                if (pd23 == fd2) {
                    String str2 = (String) propertyModel.i(pd23);
                    followManagementItemView.h.setText(str2);
                    if (TextUtils.isEmpty(str2)) {
                        followManagementItemView.h.setVisibility(8);
                        return;
                    } else {
                        followManagementItemView.h.setVisibility(0);
                        return;
                    }
                }
                PD2 pd24 = AbstractC6618jR0.d;
                if (pd24 == fd2) {
                    final Runnable runnable = (Runnable) propertyModel.i(pd24);
                    followManagementItemView.j.setOnClickListener(new View.OnClickListener() { // from class: kR0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i = FollowManagementItemView.k;
                            runnable.run();
                        }
                    });
                    return;
                }
                PD2 pd25 = AbstractC6618jR0.e;
                if (pd25 == fd2) {
                    followManagementItemView.j.setChecked(((Boolean) propertyModel.i(pd25)).booleanValue());
                    return;
                }
                PD2 pd26 = AbstractC6618jR0.f;
                if (pd26 == fd2) {
                    boolean booleanValue = ((Boolean) propertyModel.i(pd26)).booleanValue();
                    followManagementItemView.j.setClickable(booleanValue);
                    followManagementItemView.j.setEnabled(booleanValue);
                } else {
                    PD2 pd27 = AbstractC6618jR0.h;
                    if (pd27 == fd2) {
                        followManagementItemView.i.setImageBitmap((Bitmap) propertyModel.i(pd27));
                    }
                }
            }
        });
        c4617dc3.Q(1, new C2591Ty1(R.layout.f57690_resource_name_obfuscated_res_0x7f0e0112), new TD2() { // from class: fR0
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
            }
        });
        c4617dc3.Q(2, new C2591Ty1(R.layout.f57650_resource_name_obfuscated_res_0x7f0e010e), new TD2() { // from class: fR0
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
            }
        });
        View inflate = LayoutInflater.from(activity).inflate(R.layout.f57680_resource_name_obfuscated_res_0x7f0e0111, (ViewGroup) null);
        this.b = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.follow_management_list);
        recyclerView.q0(new LinearLayoutManager());
        recyclerView.n0(c4617dc3);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.action_bar);
        toolbar.C(AbstractC2884Wf.a(toolbar.getContext(), R.drawable.f44730_resource_name_obfuscated_res_0x7f0900a8));
        toolbar.D(new View.OnClickListener() { // from class: gR0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6276iR0.this.a.finish();
            }
        });
        C5932hR0 c5932hR0 = new C5932hR0(this);
        Profile d = Profile.d();
        new C9366rR0(activity, c7616mK1, c5932hR0, new Xl4(new LargeIconBridge(d), AbstractC0687Fh1.c(d.g(), AbstractC6474j01.a)));
    }
}
