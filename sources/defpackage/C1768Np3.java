package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Np3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1768Np3 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ C1898Op3 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public AbstractC9250r5 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public C1768Np3(C1898Op3 c1898Op3, Menu menu) {
        this.E = c1898Op3;
        this.a = menu;
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        C1898Op3 c1898Op3 = this.E;
        if (str != null) {
            if (!c1898Op3.c.isRestricted()) {
                if (c1898Op3.d == null) {
                    c1898Op3.d = C1898Op3.a(c1898Op3.c);
                }
                menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1638Mp3(c1898Op3.d, this.y));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof C6287iT1) {
                C6287iT1 c6287iT1 = (C6287iT1) menuItem;
                c6287iT1.x = (c6287iT1.x & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC8692pT1) {
                MenuItemC8692pT1 menuItemC8692pT1 = (MenuItemC8692pT1) menuItem;
                try {
                    Method method = menuItemC8692pT1.d;
                    InterfaceMenuItemC2028Pp3 interfaceMenuItemC2028Pp3 = menuItemC8692pT1.c;
                    if (method == null) {
                        menuItemC8692pT1.d = interfaceMenuItemC2028Pp3.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC8692pT1.d.invoke(interfaceMenuItemC2028Pp3, Boolean.TRUE);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, C1898Op3.e, c1898Op3.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        AbstractC9250r5 abstractC9250r5 = this.z;
        if (abstractC9250r5 != null) {
            if (menuItem instanceof InterfaceMenuItemC2028Pp3) {
                ((InterfaceMenuItemC2028Pp3) menuItem).a(abstractC9250r5);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof InterfaceMenuItemC2028Pp3;
        if (z2) {
            ((InterfaceMenuItemC2028Pp3) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((InterfaceMenuItemC2028Pp3) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((InterfaceMenuItemC2028Pp3) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((InterfaceMenuItemC2028Pp3) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC2028Pp3) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC2028Pp3) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
