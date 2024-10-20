package defpackage;

import com.google.common.util.concurrent.t;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hW0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5957hW0 {
    public static C9803si1 c(Object obj) {
        if (obj == null) {
            return C9803si1.g;
        }
        return new C9803si1(obj);
    }

    public static C7847n a(RD1 rd1, Class cls, InterfaceC3299Zk interfaceC3299Zk, Executor executor) {
        int i = AbstractRunnableC8534p.m;
        C7847n c7847n = new C7847n(rd1, cls, interfaceC3299Zk);
        if (executor != EnumC6747jo0.a) {
            executor = new OY1(executor, c7847n);
        }
        rd1.f(c7847n, executor);
        return c7847n;
    }

    public static C0 e(RD1 rd1, InterfaceC3299Zk interfaceC3299Zk, Executor executor) {
        int i = E0.l;
        C0 c0 = new C0(rd1, interfaceC3299Zk);
        if (executor != EnumC6747jo0.a) {
            executor = new OY1(executor, c0);
        }
        rd1.f(c0, executor);
        return c0;
    }

    public static RD1 d(RD1 rd1) {
        if (rd1.isDone()) {
            return rd1;
        }
        t tVar = new t(rd1);
        rd1.f(tVar, EnumC6747jo0.a);
        return tVar;
    }

    public static Object b(Future future) {
        future.isDone();
        return AbstractC7515m14.a(future);
    }
}
