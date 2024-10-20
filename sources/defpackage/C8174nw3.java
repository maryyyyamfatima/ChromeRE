package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.tasks.tab_management.TabGridIphDialogView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nw3 */
/* loaded from: classes.dex */
public final class C8174nw3 {
    public final ViewGroup a;
    public final TabGridIphDialogView b;
    public final PropertyModel c;
    public final ZX1 d;
    public final ViewTreeObserverOnGlobalLayoutListenerC7486lw3 e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [lw3, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    public C8174nw3(Activity activity, ViewGroup viewGroup, ZX1 zx1) {
        TraceEvent i = TraceEvent.i("TabGridIphDialogCoordinator.constructor", null);
        try {
            final TabGridIphDialogView tabGridIphDialogView = (TabGridIphDialogView) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0145, (ViewGroup) null, false);
            this.b = tabGridIphDialogView;
            this.d = zx1;
            this.a = viewGroup;
            C7830mw3 c7830mw3 = new C7830mw3(this, zx1);
            HashMap e = PropertyModel.e(AbstractC4249cY1.B);
            JD2 jd2 = AbstractC4249cY1.a;
            GD2 gd2 = new GD2();
            gd2.a = c7830mw3;
            e.put(jd2, gd2);
            LD2 ld2 = AbstractC4249cY1.r;
            AD2 ad2 = new AD2();
            ad2.a = true;
            e.put(ld2, ad2);
            PD2 pd2 = AbstractC4249cY1.j;
            String string = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140717);
            GD2 gd22 = new GD2();
            gd22.a = string;
            e.put(pd2, gd22);
            PD2 pd22 = AbstractC4249cY1.h;
            GD2 gd23 = new GD2();
            gd23.a = tabGridIphDialogView;
            e.put(pd22, gd23);
            this.c = new PropertyModel(e);
            tabGridIphDialogView.l = viewGroup;
            ?? r6 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: lw3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    TabGridIphDialogView.this.a();
                }
            };
            this.e = r6;
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(r6);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
