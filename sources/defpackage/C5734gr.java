package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.components.autofill.AutofillSuggestion;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5734gr extends C0231Bu0 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, PopupWindow.OnDismissListener, InterfaceC11564xq {
    public final Context g;
    public final InterfaceC10535uq h;
    public ArrayList i;
    public final RunnableC5046er j;

    public C5734gr(Activity activity, View view, InterfaceC10535uq interfaceC10535uq) {
        super(activity, view);
        this.j = new RunnableC5046er(this);
        this.g = activity;
        this.h = interfaceC10535uq;
        this.a.k(this);
        this.a.g(this);
        this.a.m();
        this.a.i(activity.getString(R.string.f68540_resource_name_obfuscated_res_0x7f14024e));
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.b(this.i.indexOf(((C10878vq) adapterView.getAdapter()).getItem(i)));
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        AutofillSuggestion autofillSuggestion = (AutofillSuggestion) ((C10878vq) adapterView.getAdapter()).getItem(i);
        if (!autofillSuggestion.g) {
            return false;
        }
        this.h.a(this.i.indexOf(autofillSuggestion));
        return true;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.h.d();
    }
}
