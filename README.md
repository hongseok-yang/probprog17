# CS492 Probabilistic Programming, Fall 2017, KAIST 

This is a website for the course "CS492 Probabilistic Programming", which is offered 
at the KAIST CS department in the fall of 2017. The website will contain lecture slides
and other course-related materials.

Probabilistic programming refers to the idea of developing a programming 
language for writing and reasoning about probabilistic models from machine learning 
and statistics. Such a language comes with the implementation of several generic
inference algorithms that answer various queries about the models written 
in the language, such as posterior inference and marginalisation. By providing these
algorithms, a probabilistic programming language
enables data scientists to focus on designing good models based on their domain knowledge,
instead of building effective inference engines for their models, a task that 
typically requires expertise
in machine learning, statistics and systems. Even experts in machine learning
and statistics may get benefitted from such a probabilistic programming system
because using the system they can easily explore highly advanced models.

This course has two goals. The first is to help students to be a good user
of an expressive probabilistic programming language. 
Throughout the course, we will use a particular 
language, called [Anglican](http://www.robots.ox.ac.uk/~fwood/anglican/),
but we will emphasise general principles that apply to a wide range of existing probabilistic
programming systems. The second goal is to expose the students to recent exciting results
in probabilistic programming, which come from machine learning, statistics, 
programming languages, and probability theory. 
Through a group project, students will be given a chance to study such a result
and to play with it.

## 1. Important Announcements

#### [August 27 2017] 1. Form a project group.

#### [August 27 2017] 2. Missing lectures and meetings with each project group.

There will be no lectures on the following dates:
1. September 4 (Mon) and September 6 (Wed) - Business Trip
2. October 4 (Wed) - Chuseok
3. October 9 (Mon) - Hangul Proclamation Day
4. October 16 (Mon) and October 18 (Wed) - Midterm Exam Period
5. November 13 (Mon) and November 15 (Wed) - Business Trip
6. December 11 (Mon) and December 13 (Wed) - Final Exam Period

Instead of the four missing lectures, Hongseok plans to have three meetings
with each project group for about 30 minutes. These meetings will take place as follows:
1. 7:00pm - 9:00pm on September 21 and 22 (Thu and Fri).
2. 7:00pm - 9:00pm on October 26 and 27 (Thu and Fri).
3. 7:00pm - 9:00pm on November 09 and 10 (Thu and Fri).

## 2. Logistics

#### Evaluation

Final exam (40%). Project (40%). Homework (20%).

#### Teaching Staffs

* Lecturer: [Hongseok Yang](https://cs.kaist.ac.kr/people/view?idx=552&kind=faculty&menu=160) (email: hongseok.yang@kaist.ac.kr)
* TA: Byungsu Kim (email: bskim90@kaist.ac.kr)

#### Place and Time

* Place: Room 2443 in the E3 Building
* Time: 9:00 - 10:15 on Monday and Wednesday from August 28 2017 until December 15 2017. 

Look at the announcements for the cancelled lectures and the additional meetings.

## 3. Tentative Plan

* 08/28 (Mon) - Introduction. [Slides.](https://github.com/hongseok-yang/probprog17/blob/master/Lectures/Lecture1/Lecture1.pdf)
* 08/30 (Wed) - Basics of Clojure and Tiny Bit of Anglican. [Slides.](https://github.com/hongseok-yang/probprog17/blob/master/Lectures/Lecture2/Lecture2.pdf)
* __**09/04 (Mon), 09/05 (Wed) - NO LECTURES.**__ 
* 09/11 (Mon) - Posterior Inference and Basics of Anglican. [Slides.](https://github.com/hongseok-yang/probprog17/blob/master/Lectures/Lecture3/Lecture3.pdf)
* 09/13 (Wed) - [Tentative] Generative Models in Anglican.
* 09/18 (Mon) - [Tentative] Generative Models in Anglican. 
* 09/20 (Wed) - [Tentative] Markov Chain Monte Carlo (MCMC). 
* __**09/21-22 (Thu,Fri) - EVENING MEETINGS with project groups.**__ 
* 09/25 (Mon) - [Tentative] CPS Transformation and Implementation of MCMC for Probabilsitic Programs. 
* 09/27 (Wed) - [Tentative] CPS Transformation and Implementation of MCMC for Probabilistic Programs. 
* 10/02 (Mon) - [Tentative] Sequential Monte Carlo. 
* __**10/04 (Wed), 10/09 (Mon) - NO LECTURES.**__
* 10/11 (Wed) - [Tentative] Sequential Monte Carlo. 
* __**10/16 (Mon), 10/18 (Wed) - NO LECTURES.**__
* 10/23 (Mon) - [Tentative] Basic Measure Theory.
* 10/25 (Wed) - [Tentative] Denotational Semantics of Probabilistic Programs. 
* __**10/26-27 (Thu,Fri) - EVENING MEETINGS with project groups.**__
* 10/30 (Mon) - [Tentative] Denotational Semantics of Probabilistic Programs. 
* 11/01 (Wed) - [Tentative] Denotational Semantics of Probabilistic Programs. 
* 11/06 (Mon) - [Tentative] Advanced Inference Algorithms. 
* 11/08 (Wed) - [Tentative] Advanced Inference Algorithms. 
* __**11/09-10 (Thu,Fri) - EVENING MEETINGS with project groups.**__
* __**11/13 (Mon), 11/15 (Wed) - NO LECTURES.**__
* 11/20 (Mon) - [Tentative] Advanced Inference Algorithms.
* 11/22 (Wed) - [Tentative] Advanced Inference Algorithms.
* 11/27 (Mon) - [Tentative] Group Presentation and Follow-up Discussion. 
* 11/29 (Wed) - [Tentative] Group Presentation and Follow-up Discussion.
* 12/04 (Mon) - [Tentative] Group Presentation and Follow-up Discussion.
* 12/06 (Wed) - [Tentative] Group Presentation and Follow-up Discussion.
* __**12/11 (Mon), 12/13 (Wed) - NO LECTURES.**__

## 4. Studying Materials

Unfortunately we do not know of a good textbook that matches the topics of this course exactly.Studying the lecture slides and the homework exercises of the course is likely to be the most time-efficient way to catch up with this course. Also, at each lecture, we will give students pointers to the related papers. If a student wants to study more or finds the slides and the papers too terse or difficult, we recommend to have a look at the following online materials.

1. [Anglican website](http://www.robots.ox.ac.uk/~fwood/anglican/). In particular, students will learn a lot by trying examples in the site.
2. Goodman and Stuhlmuller's book "[The Design and Implementation of Probabilistic Programming Languages](http://dippl.org/)" This web-based book describes the implementation of WebPPL, a probabilistic programming language on top of JavaScript. Many techniques in the book are general and apply to other probabilistic programming languages.
3. [Forestdb.org](http://forestdb.org/) is a great source of interesting probabilistic programs. 
4. The online book "[Probabilistic Programming and Bayesian Methods for Hackers](https://github.com/CamDavidsonPilon/Probabilistic-Programming-and-Bayesian-Methods-for-Hackers)" describes Bayesian Machine Learning using a probabilistic programming system called PyMC.  Hongseok found this book easy to follow and good at explaining basics and intuitions. A more standard reference on machine learning is Bishop's book "Pattern Recognition and Machine Learning".

## 5. Group Project

#### Objectives 

The group project is a crucial part of this course. 2-3 students should form a 
project group, and they have to follow either Track A or Track B:

1. **Track A**: A group develops an interesting application of Anglican or other probabilistic programming languages. The members of the group may attempt to find an efficient encoding of a highly complex probabilistic model (such as sequence memoizer) in Anglican,  or they may try to find a novel use of probabilistic programming for solving well-known existing problems (such as figuring out secret key in some security protocol).
2. **Track B**: A group does small-scale research on probabilistic programming. The members of the group may choose to study a recent result on probabilistic programming or a related area and attempt to extend the result. Or they may consider a research question on probabilistic programming and try to come up with an answer. We will suggest a few results and questions, although members of each group are free to choose one for themselves.

#### Concrete Tasks 

1. Form a group and email it to both Byungsu and Hongseok. [Deadline: 24:00 on Sept 11].
2. Actively participation in three evening meetings with Hongseok on Sep 21-22, Oct 26-27 and Nov 09-10.
3. Presentation and demonstration.
4. Project report.

#### Topics.

people form a group and have to do two main tasks. The first is to select a recent paper on probabilistic programming or a related topic, and to give a 30-min presentation on the selected paper. The second is to carry out a project on building a cool application of probabilistic programming, or on extending existing results slightly. This extension neither has to be grand nor has to produce better algorithms in terms of performance than existing ones, as long as it is analyzed and carried out thoughtfully. In an ideal world, both activities are related; a group reads a paper, presents it, and works on extending the results in the paper. This ideal is, however, just a recommendation, not a requirement.

Track A:
Track B:

* Automated differentiation 
* Automatic model criticism and revision:
* Program induction:
* Amortised inference
* Semantic challenges
* Black-box Variational Inference
* Interesting applciations of probabilistic programs
* Challeging models 

Papers on applications.

* Reasoning about reasoning by nested conditioning: Modeling theory of mind with probabilistic programs. Stuhlmuller, A., & Goodman, N. D. (2014). Cognitive Systems Research. [PDF](http://ac.els-cdn.com/S1389041713000387/1-s2.0-S1389041713000387-main.pdf?_tid=ccc56dc0-8ad0-11e7-b2eb-00000aacb35e&acdnat=1503801685_7dbb093f8f7c45aa3334424c07f5349d)

* Human-level Concept Learning Through Probabilistic Program Induction. Lake, B. M., Salakhutdinov, R., & Tenenbaum, J. B. (2015). Science. [PDF](http://science.sciencemag.org/content/sci/350/6266/1332.full.pdf)

* Picture: A Probabilistic Programming Language for Scene Perception. Kulkarni, T., Kohli, P., Tenenbaum, J., & Mansinghka, V. (2015). In Proceedings of CVPR 2015. [PDF](https://mrkulk.github.io/www_cvpr15/1999.pdf)

* A Probabilistic Programming Approach To Probabilistic Data Analysis. 
Saad, F., & Mansinghka, V. (2016). In Proceedings of NIPS 2016. [PDF](https://papers.nips.cc/paper/6060-a-probabilistic-programming-approach-to-probabilistic-data-analysis.pdf)

* Detecting Dependencies in Sparse, Multivariate Databases Using Probabilistic Programming and Non-parametric Bayes. Saad, F., & Mansinghka, V. (2017). In Proceedings of AISTATS 2017. [PDF](http://proceedings.mlr.press/v54/saad17a/saad17a.pdf).

Papers on inference algorithms.

* Inference Compilation and Universal Probabilistic Programming. 
Le, T. A., Baydin, A. G., & Wood, F. (2017). In Proceedings of AISTATS 2017.
[PDF](https://arxiv.org/pdf/1610.09900.pdf).

* Bayesian Optimization for Probabilistic Programs. 
Rainforth, T., Le, T. A., van de Meent, J.-W., Osborne, M. A., & Wood, F. (2016). 
In Proceedings of NIPS 2016. [PDF for short version](http://www.robots.ox.ac.uk/~fwood/assets/pdf/rainforth-nips-2016.pdf). [PDF for long version](http://www.robots.ox.ac.uk/~twgr/assets/pdf/rainforth2016BOPP.pdf).

* Design and Implementation of Probabilistic Programming Language Anglican. 
Tolpin, D., van de Meent, J.-W., Yang, H., & Wood, F. (2016). 
In Proceedings of IFL 2016. [PDF](https://arxiv.org/pdf/1608.05263.pdf).

Papers on semantics.

* Semantics for Probabilistic Programming: Higher-order Functions, Continuous Distributions, and Soft Constraints. Staton, S., Yang, H., Heunen, C., Kammar, O., & Wood, F. (2016). 
In Proceedings of LICS 2016. [PDF](https://arxiv.org/pdf/1601.04943.pdf).

* Commutative Semantics for Probabilistic Programming.  Staton, S. (2017). In Proceedings of ESOP 2017. [PDF](http://www.cs.ox.ac.uk/people/samuel.staton/papers/esop2017.pdf).

* A Convenient Category for Higher-Order Probability Theory. Heunen, C., Kammar O., Staton, S., & Yang, H. (2017). In Proceedings of LICS 2017. [PDF](https://arxiv.org/pdf/1701.02547.pdf).



