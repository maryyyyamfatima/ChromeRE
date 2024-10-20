package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5490g8 {
    public final C4115c8 a;
    public final int b;

    public C5490g8(Context context) {
        this(context, DialogC5834h8.e(context, 0));
    }

    public C5490g8(Context context, int i) {
        this.a = new C4115c8(new ContextThemeWrapper(context, DialogC5834h8.e(context, i)));
        this.b = i;
    }

    public C5490g8 i(int i) {
        C4115c8 c4115c8 = this.a;
        c4115c8.d = c4115c8.a.getText(i);
        return this;
    }

    public C5490g8 b(int i) {
        C4115c8 c4115c8 = this.a;
        c4115c8.f = c4115c8.a.getText(i);
        return this;
    }

    public C5490g8 c(CharSequence charSequence) {
        this.a.f = charSequence;
        return this;
    }

    public C5490g8 f(int i, DialogInterface.OnClickListener onClickListener) {
        C4115c8 c4115c8 = this.a;
        c4115c8.g = c4115c8.a.getText(i);
        c4115c8.h = onClickListener;
        return this;
    }

    public void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C4115c8 c4115c8 = this.a;
        c4115c8.g = charSequence;
        c4115c8.h = onClickListener;
    }

    public C5490g8 e(int i, DialogInterface.OnClickListener onClickListener) {
        C4115c8 c4115c8 = this.a;
        c4115c8.i = c4115c8.a.getText(i);
        c4115c8.j = onClickListener;
        return this;
    }

    public void d(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterfaceOnMultiChoiceClickListenerC4414d02 dialogInterfaceOnMultiChoiceClickListenerC4414d02) {
        C4115c8 c4115c8 = this.a;
        c4115c8.n = charSequenceArr;
        c4115c8.v = dialogInterfaceOnMultiChoiceClickListenerC4414d02;
        c4115c8.r = zArr;
        c4115c8.s = true;
    }

    public void h(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        C4115c8 c4115c8 = this.a;
        c4115c8.n = charSequenceArr;
        c4115c8.p = onClickListener;
        c4115c8.u = i;
        c4115c8.t = true;
    }

    public C5490g8 j(View view) {
        this.a.q = view;
        return this;
    }

    public DialogC5834h8 a() {
        int i;
        ListAdapter listAdapter;
        C4115c8 c4115c8 = this.a;
        DialogC5834h8 dialogC5834h8 = new DialogC5834h8(c4115c8.a, this.b);
        View view = c4115c8.e;
        C5146f8 c5146f8 = dialogC5834h8.j;
        if (view != null) {
            c5146f8.C = view;
        } else {
            CharSequence charSequence = c4115c8.d;
            if (charSequence != null) {
                c5146f8.e = charSequence;
                TextView textView = c5146f8.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c4115c8.c;
            if (drawable != null) {
                c5146f8.y = drawable;
                c5146f8.x = 0;
                ImageView imageView = c5146f8.z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c5146f8.z.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c4115c8.f;
        if (charSequence2 != null) {
            c5146f8.f = charSequence2;
            TextView textView2 = c5146f8.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c4115c8.g;
        if (charSequence3 != null) {
            c5146f8.d(-1, charSequence3, c4115c8.h);
        }
        CharSequence charSequence4 = c4115c8.i;
        if (charSequence4 != null) {
            c5146f8.d(-2, charSequence4, c4115c8.j);
        }
        if (c4115c8.n != null || c4115c8.o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c4115c8.b.inflate(c5146f8.G, (ViewGroup) null);
            if (c4115c8.s) {
                listAdapter = new Z7(c4115c8, c4115c8.a, c5146f8.H, c4115c8.n, alertController$RecycleListView);
            } else {
                if (c4115c8.t) {
                    i = c5146f8.I;
                } else {
                    i = c5146f8.f11506J;
                }
                listAdapter = c4115c8.o;
                if (listAdapter == null) {
                    listAdapter = new C4802e8(c4115c8.a, i, c4115c8.n);
                }
            }
            c5146f8.D = listAdapter;
            c5146f8.E = c4115c8.u;
            if (c4115c8.p != null) {
                alertController$RecycleListView.setOnItemClickListener(new C3428a8(c4115c8, c5146f8));
            } else if (c4115c8.v != null) {
                alertController$RecycleListView.setOnItemClickListener(new C3772b8(c4115c8, alertController$RecycleListView, c5146f8));
            }
            if (c4115c8.t) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c4115c8.s) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c5146f8.g = alertController$RecycleListView;
        }
        View view2 = c4115c8.q;
        if (view2 != null) {
            c5146f8.h = view2;
            c5146f8.i = 0;
            c5146f8.j = false;
        }
        dialogC5834h8.setCancelable(c4115c8.k);
        if (c4115c8.k) {
            dialogC5834h8.setCanceledOnTouchOutside(true);
        }
        dialogC5834h8.setOnCancelListener(c4115c8.l);
        dialogC5834h8.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = c4115c8.m;
        if (onKeyListener != null) {
            dialogC5834h8.setOnKeyListener(onKeyListener);
        }
        return dialogC5834h8;
    }

    public final DialogC5834h8 k() {
        DialogC5834h8 a = a();
        a.show();
        return a;
    }
}
