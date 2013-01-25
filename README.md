Half_Equation_Generator
=======================

A mini app that generates LaTeX formatted worksheets of Half Equations for my brother to practice. I could practice writing a code generator and help him revise at the same time!

Usage
========

Call it from the command line (after compiling it), the first argument should be the number of questions you want, e.g.:

```java Main 20```

Will output:

```\documentclass[twocolumn]{article}
\author{Todd Davies}
\title{Half equation practice}
\begin{document}
\maketitle
\begin{enumerate}

    \item \[ \textunderscore\textunderscore Ca^{2+}_{} + \textunderscore\textunderscore e^{-}_{} \rightarrow \textunderscore\textunderscore Ca^{}_{2} \]

    \item \[ \textunderscore\textunderscore Br^{-}_{} \rightarrow \textunderscore\textunderscore Br^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore F^{-}_{} \rightarrow \textunderscore\textunderscore F^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore S^{2-}_{} \rightarrow 3 S^{}_{2} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore Br^{-}_{} \rightarrow 3 Br^{}_{} + \textunderscore\textunderscore e^{-}_{} \]
    
    \item \[ \textunderscore\textunderscore Cl^{-}_{} \rightarrow 3 Cl^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore K^{+}_{} \rightarrow \textunderscore\textunderscore K^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore Cu^{2+}_{} + \textunderscore\textunderscore e^{-}_{} \rightarrow 3 Cu^{}_{2} \]

    \item \[ \textunderscore\textunderscore Zn^{2+}_{} + \textunderscore\textunderscore e^{-}_{} \rightarrow 2 Zn^{}_{2} \]

    \item \[ \textunderscore\textunderscore Li^{+}_{} \rightarrow  Li^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore H^{+}_{} \rightarrow  H^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore H^{+}_{} \rightarrow \textunderscore\textunderscore H^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore K^{+}_{} \rightarrow \textunderscore\textunderscore K^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore Na^{+}_{} \rightarrow \textunderscore\textunderscore Na^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore K^{+}_{} \rightarrow \textunderscore\textunderscore K^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore Zn^{2+}_{} + \textunderscore\textunderscore e^{-}_{} \rightarrow \textunderscore\textunderscore Zn^{}_{2} \]

    \item \[ \textunderscore\textunderscore Na^{+}_{} \rightarrow \textunderscore\textunderscore Na^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore S^{2-}_{} \rightarrow 3 S^{}_{2} + \textunderscore\textunderscore e^{-}_{} \]

    \item \[ \textunderscore\textunderscore Al^{3+}_{} + \textunderscore\textunderscore e^{-}_{} \rightarrow \textunderscore\textunderscore Al^{}_{2} \]

    \item \[ \textunderscore\textunderscore Cl^{-}_{} \rightarrow \textunderscore\textunderscore Cl^{}_{} + \textunderscore\textunderscore e^{-}_{} \]

\end{enumerate}

\end{document}```