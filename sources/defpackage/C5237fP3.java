package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.home.toolbar.DownloadHomeToolbar;
import org.chromium.components.browser_ui.widget.FadingShadowView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fP3 */
/* loaded from: classes.dex */
public final class C5237fP3 implements InterfaceC7182l33 {
    public final C3613ah0 a;
    public final C9519rs0 g;
    public final ViewGroup h;
    public final DownloadHomeToolbar i;
    public final FadingShadowView j;
    public boolean k;

    public C5237fP3(Context context, C9519rs0 c9519rs0, C3613ah0 c3613ah0, C7526m33 c7526m33, boolean z, final KU3 ku3) {
        C4893eP3 c4893eP3 = new C4893eP3(this);
        this.g = c9519rs0;
        this.a = c3613ah0;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00d6, (ViewGroup) null);
        this.h = viewGroup;
        final DownloadHomeToolbar downloadHomeToolbar = (DownloadHomeToolbar) viewGroup.findViewById(R.id.download_toolbar);
        this.i = downloadHomeToolbar;
        FadingShadowView fadingShadowView = (FadingShadowView) viewGroup.findViewById(R.id.shadow);
        this.j = fadingShadowView;
        downloadHomeToolbar.J(c7526m33, R.string.0_resource_name_obfuscated_res_0x7f140621, R.id.normal_menu_group, R.id.selection_mode_menu_group, z);
        downloadHomeToolbar.N = new BO3() { // from class: aP3
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // defpackage.BO3
            public final boolean onMenuItemClick(android.view.MenuItem r13) {
                /*
                    r12 = this;
                    fP3 r0 = defpackage.C5237fP3.this
                    r0.getClass()
                    int r1 = r13.getItemId()
                    r2 = 2130773689(0x7f0106b9, float:1.7150532E38)
                    r3 = 2130773615(0x7f01066f, float:1.7150382E38)
                    r4 = 2130773677(0x7f0106ad, float:1.7150507E38)
                    r5 = 0
                    r6 = 2130773669(0x7f0106a5, float:1.7150491E38)
                    r7 = 2130772354(0x7f010182, float:1.7147824E38)
                    r8 = 1
                    if (r1 != r7) goto L21
                    java.lang.String r1 = "Close"
                    r9 = r1
                    r1 = r5
                    goto L39
                L21:
                    if (r1 != r6) goto L28
                    java.lang.String r1 = "MultiDelete"
                    r9 = r1
                    r1 = r8
                    goto L39
                L28:
                    if (r1 != r4) goto L2e
                    r1 = 2
                    java.lang.String r9 = "MultiShare"
                    goto L39
                L2e:
                    if (r1 != r3) goto L34
                    r1 = 5
                    java.lang.String r9 = "Search"
                    goto L39
                L34:
                    if (r1 != r2) goto L48
                    r1 = 6
                    java.lang.String r9 = "Settings"
                L39:
                    r10 = 7
                    java.lang.String r11 = "Android.DownloadManager.Menu.Action"
                    defpackage.EI2.h(r1, r10, r11)
                    java.lang.String r1 = "Android.DownloadManager.Menu.Action."
                    java.lang.String r1 = r1.concat(r9)
                    defpackage.FI2.a(r1)
                L48:
                    int r1 = r13.getItemId()
                    rs0 r9 = r0.g
                    if (r1 != r7) goto L56
                    android.app.Activity r13 = r9.f
                    r13.finish()
                    goto Lc0
                L56:
                    int r1 = r13.getItemId()
                    ah0 r7 = r0.a
                    if (r1 != r6) goto L7a
                    yh0 r13 = r7.c
                    m33 r0 = r13.k
                    java.util.Set r1 = r0.c
                    java.util.ArrayList r1 = defpackage.PD1.c(r1)
                    r13.a(r1)
                    java.util.Set r13 = r0.c
                    int r13 = r13.size()
                    r0.b()
                    java.lang.String r0 = "Android.DownloadManager.Menu.Delete.SelectedCount"
                    defpackage.EI2.d(r13, r0)
                    goto Lc0
                L7a:
                    int r1 = r13.getItemId()
                    if (r1 != r4) goto L9c
                    yh0 r13 = r7.c
                    m33 r0 = r13.k
                    java.util.Set r1 = r0.c
                    java.util.ArrayList r1 = defpackage.PD1.c(r1)
                    r13.b(r1)
                    java.util.Set r13 = r0.c
                    int r13 = r13.size()
                    r0.b()
                    java.lang.String r0 = "Android.DownloadManager.Menu.Share.SelectedCount"
                    defpackage.EI2.d(r13, r0)
                    goto Lc0
                L9c:
                    int r1 = r13.getItemId()
                    if (r1 != r3) goto Lab
                    org.chromium.chrome.browser.download.home.toolbar.DownloadHomeToolbar r13 = r0.i
                    r13.P()
                    r0.a()
                    goto Lc0
                Lab:
                    int r13 = r13.getItemId()
                    if (r13 != r2) goto Lc1
                    r9.getClass()
                    java.lang.String r13 = "Android.DownloadManager.Settings"
                    defpackage.FI2.a(r13)
                    org.chromium.base.Callback r13 = r9.g
                    android.app.Activity r0 = r9.f
                    r13.onResult(r0)
                Lc0:
                    r5 = r8
                Lc1:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C3519aP3.onMenuItemClick(android.view.MenuItem):boolean");
            }
        };
        downloadHomeToolbar.K(c4893eP3, R.string.0_resource_name_obfuscated_res_0x7f140434, R.id.search_menu_id);
        ku3.d(new Callback() { // from class: uR3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9513rr0 c9513rr0 = AbstractC8828pr0.a;
                final View view = downloadHomeToolbar;
                final KU3 ku32 = ku3;
                c9513rr0.a(new Callback() { // from class: vR3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        if (((ArrayList) obj2).size() < 2) {
                            return;
                        }
                        KU3 ku33 = ku32;
                        if (ku33.shouldTriggerHelpUI("IPH_DownloadSettings")) {
                            View view2 = view;
                            View findViewById = view2.findViewById(R.id.settings_menu_id);
                            WeakHashMap weakHashMap = Ec4.a;
                            if (view2.isAttachedToWindow()) {
                                AbstractC12113zR3.a(ku33, findViewById, view2);
                            } else {
                                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC11427xR3(ku33, findViewById, view2));
                            }
                        }
                    }
                });
            }
        });
        fadingShadowView.a(context.getColor(R.color.0_resource_name_obfuscated_res_0x7f0708ad));
        if (z) {
            return;
        }
        downloadHomeToolbar.o().removeItem(R.id.close_menu_id);
    }

    @Override // defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        a();
    }

    public final void a() {
        this.j.setVisibility(this.k || this.i.b0 ? 0 : 8);
    }
}
