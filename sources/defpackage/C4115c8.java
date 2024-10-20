package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4115c8 {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public DialogInterface.OnCancelListener l;
    public DialogInterface.OnKeyListener m;
    public CharSequence[] n;
    public ListAdapter o;
    public DialogInterface.OnClickListener p;
    public View q;
    public boolean[] r;
    public boolean s;
    public boolean t;
    public DialogInterface.OnMultiChoiceClickListener v;
    public int u = -1;
    public boolean k = true;

    public C4115c8(ContextThemeWrapper contextThemeWrapper) {
        this.a = contextThemeWrapper;
        this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
