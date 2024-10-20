package defpackage;

import android.content.Context;
import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.webapps.launchpad.AppManagementMenuPermissionsView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mi */
/* loaded from: classes2.dex */
public final class C7742mi {
    public C7742mi(Context context, AppManagementMenuPermissionsView appManagementMenuPermissionsView, C1806Nx1 c1806Nx1) {
        UD2.a(new C8430oi(context, C1193Je2.b(c1806Nx1.d)).d, appManagementMenuPermissionsView, new TD2() { // from class: li
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                AppManagementMenuPermissionsView appManagementMenuPermissionsView2 = (AppManagementMenuPermissionsView) obj;
                FD2 fd2 = (FD2) obj2;
                ND2 nd2 = AbstractC8773pi.a;
                if (fd2 == nd2) {
                    AbstractC10487ui.a(appManagementMenuPermissionsView2, R.id.notifications_button, propertyModel.h(nd2), R.drawable.0_resource_name_obfuscated_res_0x7f090194, R.drawable.0_resource_name_obfuscated_res_0x7f090195);
                    return;
                }
                ND2 nd22 = AbstractC8773pi.b;
                if (fd2 == nd22) {
                    AbstractC10487ui.a(appManagementMenuPermissionsView2, R.id.mic_button, propertyModel.h(nd22), R.drawable.0_resource_name_obfuscated_res_0x7f090191, R.drawable.0_resource_name_obfuscated_res_0x7f090192);
                    return;
                }
                ND2 nd23 = AbstractC8773pi.c;
                if (fd2 == nd23) {
                    AbstractC10487ui.a(appManagementMenuPermissionsView2, R.id.camera_button, propertyModel.h(nd23), R.drawable.0_resource_name_obfuscated_res_0x7f090198, R.drawable.0_resource_name_obfuscated_res_0x7f090199);
                    return;
                }
                ND2 nd24 = AbstractC8773pi.d;
                if (fd2 == nd24) {
                    AbstractC10487ui.a(appManagementMenuPermissionsView2, R.id.location_button, propertyModel.h(nd24), R.drawable.0_resource_name_obfuscated_res_0x7f090190, R.drawable.0_resource_name_obfuscated_res_0x7f09018f);
                    return;
                }
                PD2 pd2 = AbstractC8773pi.e;
                if (fd2 == pd2) {
                    final C8086ni c8086ni = (C8086ni) propertyModel.i(pd2);
                    appManagementMenuPermissionsView2.a.setOnClickListener(new View.OnClickListener() { // from class: qi
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i = AppManagementMenuPermissionsView.j;
                            C8086ni.this.a(AbstractC8773pi.a);
                        }
                    });
                    appManagementMenuPermissionsView2.g.setOnClickListener(new View.OnClickListener() { // from class: ri
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i = AppManagementMenuPermissionsView.j;
                            C8086ni.this.a(AbstractC8773pi.b);
                        }
                    });
                    appManagementMenuPermissionsView2.h.setOnClickListener(new View.OnClickListener() { // from class: si
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i = AppManagementMenuPermissionsView.j;
                            C8086ni.this.a(AbstractC8773pi.c);
                        }
                    });
                    appManagementMenuPermissionsView2.i.setOnClickListener(new View.OnClickListener() { // from class: ti
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i = AppManagementMenuPermissionsView.j;
                            C8086ni.this.a(AbstractC8773pi.d);
                        }
                    });
                }
            }
        });
    }
}
