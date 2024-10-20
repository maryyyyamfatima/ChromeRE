package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import java.util.HashMap;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ii */
/* loaded from: classes2.dex */
public final class C6367ii implements InterfaceC3906bY1 {
    public final Context a;
    public final InterfaceC0079Ap3 g;
    public final SettingsLauncher h;
    public PropertyModel i;
    public ListView j;
    public C7742mi k;

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
    }

    public C6367ii(Context context, InterfaceC0079Ap3 interfaceC0079Ap3, I53 i53) {
        this.a = context;
        this.g = interfaceC0079Ap3;
        this.h = i53;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.i = null;
        if (this.k != null) {
            this.k = null;
        }
    }

    public final C7272lK1 b(int i, View.OnClickListener onClickListener) {
        HashMap e = PropertyModel.e(B93.f);
        PD2 pd2 = B93.a;
        String string = this.a.getString(i);
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(pd2, gd2);
        LD2 ld2 = B93.d;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd22 = B93.e;
        GD2 gd22 = new GD2();
        gd22.a = onClickListener;
        return new C7272lK1(1, AbstractC5266fV2.a(e, pd22, gd22, e));
    }
}
