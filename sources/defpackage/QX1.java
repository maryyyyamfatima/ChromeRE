package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.v;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QX1 extends MP0 {
    public volatile String i;
    public final C3954bg3 j;

    public QX1(C7123kt2 c7123kt2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Set set) {
        super(c7123kt2, str, str2, z, z3, set);
        this.j = new C3954bg3(c7123kt2, str, str2, z2);
    }

    @Override // defpackage.MP0
    public final RD1 a() {
        if (this.i.isEmpty()) {
            return C9803si1.g;
        }
        C5900hK3 c5900hK3 = (C5900hK3) this.a.c.get();
        String str = this.i;
        C4374ct2 c4374ct2 = c5900hK3.a;
        c4374ct2.getClass();
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new C3342Zs2(str);
        AF3 b = c4374ct2.b(0, c5531gF3.a());
        C11367xF3 c11367xF3 = new C11367xF3(b);
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        b.b(enumC6747jo0, new C11024wF3(c11367xF3));
        return AbstractC5957hW0.a(AbstractC5957hW0.a(c11367xF3, C10114td.class, new C5212fK3(), enumC6747jo0), C1527Lt2.class, new InterfaceC3299Zk() { // from class: MX1
            @Override // defpackage.InterfaceC3299Zk
            public final RD1 apply(Object obj) {
                C1527Lt2 c1527Lt2 = (C1527Lt2) obj;
                QX1 qx1 = QX1.this;
                qx1.getClass();
                if (c1527Lt2.a == 29501) {
                    Log.w("MobStoreFlagStore", "Failed to commit due to stale snapshot for " + qx1.b + ", triggering flag update.", c1527Lt2);
                    qx1.b();
                }
                return new v(c1527Lt2);
            }
        }, this.a.a());
    }

    @Override // defpackage.MP0
    public final void b() {
        String string;
        boolean z = this.f;
        C7123kt2 c7123kt2 = this.a;
        if (!z) {
            string = this.c;
        } else {
            Context context = c7123kt2.a;
            BT2 bt2 = AbstractC1657Mt2.a;
            string = context.getSharedPreferences("PhenotypeStickyAccount", 0).getString(this.b, "");
        }
        C3954bg3 c3954bg3 = this.j;
        final D0 a = c3954bg3.a(string);
        AbstractC5957hW0.e(a, new IX1(c3954bg3), c7123kt2.a()).f(new Runnable() { // from class: JX1
            @Override // java.lang.Runnable
            public final void run() {
                RD1 rd1 = a;
                final QX1 qx1 = QX1.this;
                boolean z2 = qx1.g;
                try {
                    rd1.isDone();
                    C4641dg3 c4641dg3 = (C4641dg3) AbstractC7515m14.a(rd1);
                    boolean a2 = qx1.d.a(C3954bg3.b(c4641dg3), z2);
                    C7123kt2 c7123kt22 = qx1.a;
                    if (a2) {
                        qx1.e.a.incrementAndGet();
                        if (z2) {
                            C5900hK3 c5900hK3 = (C5900hK3) c7123kt22.c.get();
                            String str = c4641dg3.k;
                            C4374ct2 c4374ct2 = c5900hK3.a;
                            c4374ct2.getClass();
                            C5531gF3 c5531gF3 = new C5531gF3();
                            c5531gF3.a = new C3342Zs2(str);
                            AF3 b = c4374ct2.b(0, c5531gF3.a());
                            C11367xF3 c11367xF3 = new C11367xF3(b);
                            Executor executor = EnumC6747jo0.a;
                            b.b(executor, new C11024wF3(c11367xF3));
                            C7847n a3 = AbstractC5957hW0.a(c11367xF3, C10114td.class, new C5212fK3(), executor);
                            CV0 cv0 = new CV0() { // from class: LX1
                                @Override // defpackage.CV0
                                public final Object apply(Object obj) {
                                    Log.w("MobStoreFlagStore", "Failed to commit to updated flags for " + QX1.this.b, (Throwable) obj);
                                    return null;
                                }
                            };
                            Executor a4 = c7123kt22.a();
                            int i = AbstractRunnableC8534p.m;
                            C8191o c8191o = new C8191o(a3, Throwable.class, cv0);
                            if (a4 != executor) {
                                a4 = new OY1(a4, c8191o);
                            }
                            a3.f(c8191o, a4);
                            return;
                        }
                        return;
                    }
                    if (((C1398Kt2) c7123kt22.d.e()) != null) {
                        ((C1398Kt2) c7123kt22.d.e()).a();
                    }
                } catch (CancellationException e) {
                    e = e;
                    Log.w("MobStoreFlagStore", "Unable to update local snapshot for " + qx1.b + ", may result in stale flags.", e);
                } catch (ExecutionException e2) {
                    e = e2;
                    Log.w("MobStoreFlagStore", "Unable to update local snapshot for " + qx1.b + ", may result in stale flags.", e);
                }
            }
        }, c7123kt2.a());
    }
}
