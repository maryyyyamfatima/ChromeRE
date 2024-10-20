package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.android.chrome.R;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC5834h8 extends DialogC0805Gf {
    public final C5146f8 j;

    public DialogC5834h8(Context context, int i) {
        super(context, e(context, i));
        this.j = new C5146f8(getContext(), this, getWindow());
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f2520_resource_name_obfuscated_res_0x7f050029, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.DialogC0805Gf, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C5146f8 c5146f8 = this.j;
        c5146f8.e = charSequence;
        TextView textView = c5146f8.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.DialogC0805Gf, defpackage.DialogC8536p00, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        View view;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        C5146f8 c5146f8 = this.j;
        c5146f8.b.setContentView(c5146f8.F);
        Window window = c5146f8.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = c5146f8.h;
        Context context = c5146f8.a;
        if (view2 == null) {
            view2 = c5146f8.i != 0 ? LayoutInflater.from(context).inflate(c5146f8.i, viewGroup, false) : null;
        }
        boolean z = view2 != null;
        if (!z || !C5146f8.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (c5146f8.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c5146f8.g != null) {
                ((LinearLayout.LayoutParams) ((LB1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c = C5146f8.c(findViewById6, findViewById3);
        ViewGroup c2 = C5146f8.c(findViewById7, findViewById4);
        ViewGroup c3 = C5146f8.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c5146f8.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c5146f8.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c2.findViewById(android.R.id.message);
        c5146f8.B = textView;
        if (textView != null) {
            CharSequence charSequence = c5146f8.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c5146f8.w.removeView(c5146f8.B);
                if (c5146f8.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c5146f8.w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c5146f8.w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c5146f8.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c2.setVisibility(8);
                }
            }
        }
        Button button = (Button) c3.findViewById(android.R.id.button1);
        c5146f8.k = button;
        Y7 y7 = c5146f8.M;
        button.setOnClickListener(y7);
        boolean isEmpty = TextUtils.isEmpty(c5146f8.l);
        int i2 = c5146f8.d;
        if (isEmpty && c5146f8.n == null) {
            c5146f8.k.setVisibility(8);
            i = 0;
        } else {
            c5146f8.k.setText(c5146f8.l);
            Drawable drawable = c5146f8.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i2, i2);
                c5146f8.k.setCompoundDrawables(c5146f8.n, null, null, null);
            }
            c5146f8.k.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) c3.findViewById(android.R.id.button2);
        c5146f8.o = button2;
        button2.setOnClickListener(y7);
        if (TextUtils.isEmpty(c5146f8.p) && c5146f8.r == null) {
            c5146f8.o.setVisibility(8);
        } else {
            c5146f8.o.setText(c5146f8.p);
            Drawable drawable2 = c5146f8.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i2, i2);
                c5146f8.o.setCompoundDrawables(c5146f8.r, null, null, null);
            }
            c5146f8.o.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) c3.findViewById(android.R.id.button3);
        c5146f8.s = button3;
        button3.setOnClickListener(y7);
        if (TextUtils.isEmpty(c5146f8.t) && c5146f8.v == null) {
            c5146f8.s.setVisibility(8);
            view = null;
        } else {
            c5146f8.s.setText(c5146f8.t);
            Drawable drawable3 = c5146f8.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i2, i2);
                view = null;
                c5146f8.s.setCompoundDrawables(c5146f8.v, null, null, null);
            } else {
                view = null;
            }
            c5146f8.s.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f2500_resource_name_obfuscated_res_0x7f050027, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                C5146f8.b(c5146f8.k);
            } else if (i == 2) {
                C5146f8.b(c5146f8.o);
            } else if (i == 4) {
                C5146f8.b(c5146f8.s);
            }
        }
        if (!(i != 0)) {
            c3.setVisibility(8);
        }
        if (c5146f8.C != null) {
            c.addView(c5146f8.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c5146f8.z = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(c5146f8.e)) && c5146f8.K) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c5146f8.A = textView2;
                textView2.setText(c5146f8.e);
                int i3 = c5146f8.x;
                if (i3 != 0) {
                    c5146f8.z.setImageResource(i3);
                } else {
                    Drawable drawable4 = c5146f8.y;
                    if (drawable4 != null) {
                        c5146f8.z.setImageDrawable(drawable4);
                    } else {
                        c5146f8.A.setPadding(c5146f8.z.getPaddingLeft(), c5146f8.z.getPaddingTop(), c5146f8.z.getPaddingRight(), c5146f8.z.getPaddingBottom());
                        c5146f8.z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                c5146f8.z.setVisibility(8);
                c.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i4 = (c == null || c.getVisibility() == 8) ? 0 : 1;
        boolean z3 = c3.getVisibility() != 8;
        if (!z3 && (findViewById = c2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView2 = c5146f8.w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (c5146f8.f == null && c5146f8.g == null) ? view : c.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = c2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c5146f8.g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i4 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i4 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.g);
            }
        }
        if (!z2) {
            View view3 = c5146f8.g;
            if (view3 == null) {
                view3 = c5146f8.w;
            }
            if (view3 != null) {
                int i5 = z3 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = Ec4.a;
                view3.setScrollIndicators(i4 | i5, 3);
                if (findViewById11 != null) {
                    c2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c5146f8.g;
        if (alertController$RecycleListView2 == null || (listAdapter = c5146f8.D) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i6 = c5146f8.E;
        if (i6 > -1) {
            alertController$RecycleListView2.setItemChecked(i6, true);
            alertController$RecycleListView2.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.j.w;
        if (nestedScrollView != null && nestedScrollView.m(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.j.w;
        if (nestedScrollView != null && nestedScrollView.m(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
