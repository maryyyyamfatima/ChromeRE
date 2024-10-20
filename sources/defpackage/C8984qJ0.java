package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;
import org.chromium.chrome.browser.feed.feedmanagement.FeedManagementItemView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qJ0 */
/* loaded from: classes.dex */
public final class C8984qJ0 {
    public final a a;
    public final View b;

    public C8984qJ0(Activity activity, InterfaceC11727yJ0 interfaceC11727yJ0, InterfaceC11384xJ0 interfaceC11384xJ0, int i) {
        a aVar = (a) activity;
        this.a = aVar;
        C7616mK1 c7616mK1 = new C7616mK1();
        C7342lY1 c7342lY1 = new C7342lY1(c7616mK1);
        c7342lY1.a(0, new C2591Ty1(R.layout.0_resource_name_obfuscated_res_0x7f0e010b), new TD2() { // from class: oJ0
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                FeedManagementItemView feedManagementItemView = (FeedManagementItemView) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = AbstractC9326rJ0.a;
                if (pd2 == fd2) {
                    feedManagementItemView.a.setText((String) propertyModel.i(pd2));
                    return;
                }
                PD2 pd22 = AbstractC9326rJ0.b;
                if (pd22 == fd2) {
                    feedManagementItemView.g.setText((String) propertyModel.i(pd22));
                } else {
                    PD2 pd23 = AbstractC9326rJ0.c;
                    if (pd23 == fd2) {
                        feedManagementItemView.setOnClickListener((View.OnClickListener) propertyModel.i(pd23));
                    }
                }
            }
        });
        View inflate = LayoutInflater.from(aVar).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e010a, (ViewGroup) null);
        this.b = inflate;
        ((ListView) inflate.findViewById(R.id.feed_management_menu)).setAdapter((ListAdapter) c7342lY1);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.action_bar);
        toolbar.C(AbstractC2884Wf.a(toolbar.getContext(), R.drawable.0_resource_name_obfuscated_res_0x7f0900a8));
        toolbar.D(new View.OnClickListener() { // from class: pJ0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8984qJ0.this.a.finish();
            }
        });
        new C12070zJ0(aVar, c7616mK1, interfaceC11727yJ0, interfaceC11384xJ0, i);
    }
}
