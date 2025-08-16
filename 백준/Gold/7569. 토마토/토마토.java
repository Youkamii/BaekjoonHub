import java.io.*;
public class Main{
    static final class F{
        InputStream i=System.in; byte[] b=new byte[1<<16]; int p,l;
        int r() throws IOException{ if(p>=l){ l=i.read(b); p=0; if(l<=0) return -1;} return b[p++]; }
        int n() throws IOException{ int c=r(),s=1,v=0; while(c<=32)c=r(); if(c=='-'){ s=-1; c=r(); } while(c>32){ v=v*10+c-48; c=r(); } return v*s; }
    }
    public static void main(String[] a) throws Exception{
        F f=new F();
        int M=f.n(),N=f.n(),H=f.n(),nm=N*M;
        int[] g=new int[nm*H],qx=new int[nm*H],qy=new int[nm*H],qz=new int[nm*H];
        int h=0,u=0,c=0,m=1;
        for(int z=0;z<H;z++){
            int bz=z*nm;
            for(int y=0;y<N;y++){
                int by=bz+y*M;
                for(int x=0;x<M;x++){
                    int v=f.n(),idx=by+x;
                    g[idx]=v;
                    if(v==0)c++; else if(v==1){ qx[u]=x;qy[u]=y;qz[u]=z;u++; }
                }
            }
        }
        while(h<u){
            int x=qx[h],y=qy[h],z=qz[h],idx=z*nm+y*M+x,d=g[idx]; h++;
            if(x+1<M){ int nidx=idx+1; if(g[nidx]==0){ g[nidx]=d+1; if(--c==0){ System.out.print(d); return;} if(d+1>m)m=d+1; qx[u]=x+1;qy[u]=y;qz[u]=z;u++; } }
            if(x>0){ int nidx=idx-1; if(g[nidx]==0){ g[nidx]=d+1; if(--c==0){ System.out.print(d); return;} if(d+1>m)m=d+1; qx[u]=x-1;qy[u]=y;qz[u]=z;u++; } }
            if(y+1<N){ int nidx=idx+M; if(g[nidx]==0){ g[nidx]=d+1; if(--c==0){ System.out.print(d); return;} if(d+1>m)m=d+1; qx[u]=x;qy[u]=y+1;qz[u]=z;u++; } }
            if(y>0){ int nidx=idx-M; if(g[nidx]==0){ g[nidx]=d+1; if(--c==0){ System.out.print(d); return;} if(d+1>m)m=d+1; qx[u]=x;qy[u]=y-1;qz[u]=z;u++; } }
            if(z+1<H){ int nidx=idx+nm; if(g[nidx]==0){ g[nidx]=d+1; if(--c==0){ System.out.print(d); return;} if(d+1>m)m=d+1; qx[u]=x;qy[u]=y;qz[u]=z+1;u++; } }
            if(z>0){ int nidx=idx-nm; if(g[nidx]==0){ g[nidx]=d+1; if(--c==0){ System.out.print(d); return;} if(d+1>m)m=d+1; qx[u]=x;qy[u]=y;qz[u]=z-1;u++; } }
        }
        if(c>0)System.out.print(-1); else System.out.print(m-1);
    }
}
