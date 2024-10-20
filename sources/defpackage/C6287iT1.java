package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6287iT1 implements InterfaceMenuItemC2028Pp3 {
    public AbstractC9250r5 A;
    public MenuItem.OnActionExpandListener B;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public final BS1 n;
    public SubMenuC0074Ao3 o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public int y;
    public View z;
    public int i = 4096;
    public int k = 4096;
    public int m = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    public C6287iT1(BS1 bs1, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = bs1;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.y = i5;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.p(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.p(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.p(false);
        return this;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.o != null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.p(false);
        SubMenuC0074Ao3 subMenuC0074Ao3 = this.o;
        if (subMenuC0074Ao3 != null) {
            subMenuC0074Ao3.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.m;
        if (i == 0) {
            return null;
        }
        Drawable a = AbstractC2884Wf.a(this.n.a, i);
        this.m = 0;
        this.l = a;
        return d(a);
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = drawable.mutate();
            if (this.u) {
                drawable.setTintList(this.s);
            }
            if (this.v) {
                drawable.setTintMode(this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.x = i2;
        if (i != i2) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.x;
        int i2 = i & 4;
        BS1 bs1 = this.n;
        if (i2 != 0) {
            bs1.getClass();
            ArrayList arrayList = bs1.f;
            int size = arrayList.size();
            bs1.w();
            for (int i3 = 0; i3 < size; i3++) {
                C6287iT1 c6287iT1 = (C6287iT1) arrayList.get(i3);
                if (c6287iT1.b == this.b) {
                    if (((c6287iT1.x & 4) != 0) && c6287iT1.isCheckable()) {
                        boolean z2 = c6287iT1 == this;
                        int i4 = c6287iT1.x;
                        int i5 = (z2 ? 2 : 0) | (i4 & (-3));
                        c6287iT1.x = i5;
                        if (i4 != i5) {
                            c6287iT1.n.p(false);
                        }
                    }
                }
            }
            bs1.v();
        } else {
            int i6 = (z ? 2 : 0) | (i & (-3));
            this.x = i6;
            if (i != i6) {
                bs1.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC9250r5 abstractC9250r5 = this.A;
        return (abstractC9250r5 == null || !abstractC9250r5.c()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.a();
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.x = i2;
        if (i != i2) {
            BS1 bs1 = this.n;
            bs1.h = true;
            bs1.p(true);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void f(boolean z) {
        if (z) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i;
        BS1 bs1 = this.n;
        bs1.k = true;
        bs1.p(true);
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        BS1 bs1 = this.n;
        bs1.k = true;
        bs1.p(true);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        AbstractC9250r5 abstractC9250r5 = this.A;
        if (abstractC9250r5 == null) {
            return null;
        }
        View b = abstractC9250r5.b(this);
        this.z = b;
        return b;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3
    public final AbstractC9250r5 b() {
        return this.A;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3
    public final InterfaceMenuItemC2028Pp3 a(AbstractC9250r5 abstractC9250r5) {
        AbstractC9250r5 abstractC9250r52 = this.A;
        if (abstractC9250r52 != null) {
            abstractC9250r52.getClass();
        }
        this.z = null;
        this.A = abstractC9250r5;
        this.n.p(true);
        AbstractC9250r5 abstractC9250r53 = this.A;
        if (abstractC9250r53 != null) {
            abstractC9250r53.d(new C5943hT1(this));
        }
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        BS1 bs1 = this.n;
        Context context = bs1.a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.a) > 0) {
            inflate.setId(i2);
        }
        bs1.k = true;
        bs1.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.n.a.getString(i));
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final boolean e() {
        AbstractC9250r5 abstractC9250r5;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (abstractC9250r5 = this.A) != null) {
            this.z = abstractC9250r5.b(this);
        }
        return this.z != null;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final InterfaceMenuItemC2028Pp3 setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final InterfaceMenuItemC2028Pp3 setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC2028Pp3, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }
}
