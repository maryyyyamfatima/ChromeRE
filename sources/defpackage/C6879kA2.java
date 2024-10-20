package defpackage;

import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import org.chromium.base.ThreadUtils;
import org.chromium.printing.Printable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kA2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6879kA2 implements InterfaceC6535jA2, InterfaceC4474dA2 {
    public static C6879kA2 o;
    public String a;
    public int b;
    public int c;
    public ParcelFileDescriptor d;
    public int e;
    public PrintAttributes.MediaSize f;
    public int[] g;
    public InterfaceC4817eA2 h;
    public InterfaceC3787bA2 i;
    public Printable j;
    public final C5505gA2 k;
    public int l = 0;
    public boolean m;
    public C5849hA2 n;

    public C6879kA2() {
        C5505gA2 c5505gA2 = new C5505gA2();
        this.k = c5505gA2;
        c5505gA2.a = this;
    }

    public static InterfaceC6535jA2 a() {
        Object obj = ThreadUtils.a;
        if (o == null) {
            o = new C6879kA2();
        }
        return o;
    }

    public final void b() {
        if ((this.m || this.n == null || !this.j.b()) ? false : true) {
            this.m = true;
            C5849hA2 c5849hA2 = this.n;
            String title = this.j.getTitle();
            C5505gA2 c5505gA2 = this.k;
            c5505gA2.getClass();
            c5849hA2.a.print(title, c5505gA2, null);
            this.n = null;
        }
    }
}
